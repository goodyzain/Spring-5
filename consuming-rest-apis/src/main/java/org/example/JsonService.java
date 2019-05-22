package org.example;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.deltaspike.core.api.config.ConfigProperty;
import org.example.domain.Example;

/**
 */
@ApplicationScoped
public class JsonService {
    
    @Inject
    @ConfigProperty(name = "weathermap.apikey")
    private String apikey;

    private Client client;
    private WebTarget target;

    @PostConstruct
    protected void init() {
        client = ClientBuilder.newClient();
        //example query params: ?q=Turku&cnt=10&mode=json&units=metric
        target = client.target(
                "http://api.openweathermap.org/data/2.5/weather").queryParam("appid", apikey)
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                ;
    }

    public Example getForecast(String place) {
        return target.queryParam("q", place)
                .request(MediaType.APPLICATION_JSON)
                .get(Example.class);
    }
}
