package com.gimn.yourway.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	@GeneratedValue
	private int id;
	
	private String type;
	
	//path to the image of the form( for form only )
	private String image;
}
