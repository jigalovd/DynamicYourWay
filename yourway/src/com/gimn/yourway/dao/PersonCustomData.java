package com.gimn.yourway.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonCustomData {
	@Id
	@GeneratedValue
	private int id;
	
	private String value;
	
	public PersonCustomData(){}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	
	
}
