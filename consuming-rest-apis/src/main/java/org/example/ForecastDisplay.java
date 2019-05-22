package org.example;

import java.time.LocalDate;

import org.example.domain.Example;
import org.example.domain.Forecast;

import com.vaadin.ui.Grid;

/**
 *
 * @author Matti Tahvonen <matti@vaadin.com>
 */
public class ForecastDisplay extends Grid<Forecast> {

    String captionTemplate = "Tomorrow in %s there will be %s";

    public void setForecast(Example fr) {
        setCaption(
                String.format(captionTemplate,
                    fr.getName(),
                    fr.getWeather().get(0).
                    getDescription())
        );

        removeAllColumns();
//        addColumn(fc -> {
//            int day = fr.getList().indexOf(fc);
//            return LocalDate.now().plusDays(day);
//        }).setCaption("Day");
//        addColumn(fc -> fc.getTemp().getDay() + "° C").setCaption("Temp");
//        addColumn(fc -> fc.getWeather().get(0).getDescription()).setCaption("Description");
//
//        setItems(fr.getList());
    }

}
