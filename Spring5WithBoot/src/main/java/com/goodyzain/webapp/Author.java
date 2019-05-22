package com.goodyzain.webapp;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String authorName;
	private String lastName;
	@ManyToMany
	private Set<Book> books = new HashSet<Book>();
	
	public Author() {
	}
	
	

	public Author(String authorName, String lastName) {
		this.authorName = authorName;
		this.lastName = lastName;
	}

	public Author(String authorName, String lastName, Set<Book> books) {
		this.authorName = authorName;
		this.lastName = lastName;
		this.books = books;
	}



	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
