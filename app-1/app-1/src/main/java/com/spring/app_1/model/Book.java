package com.spring.app_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id @GeneratedValue
	private Integer id;
	private String name;
	private String author;
	private String status;
	
	public Book() {}
	
	public Book(String name, String author, String status) {
		super();
		this.name= name;
		this.author= author;
		this.status= status;
	}

	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}

	public String getStatus() {
		return status;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}