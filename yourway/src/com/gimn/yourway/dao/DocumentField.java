package com.gimn.yourway.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DocumentField {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String attribute;
	
	private boolean flagPersonData;
	
	public DocumentField(){}

	/**
	 * @return the attribute
	 */
	public String getAttribute() {
		return attribute;
	}

	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * @return the flagPersonData
	 */
	public boolean isFlagPersonData() {
		return flagPersonData;
	}

	/**
	 * @param flagPersonData the flagPersonData to set
	 */
	public void setFlagPersonData(boolean flagPersonData) {
		this.flagPersonData = flagPersonData;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	

}
