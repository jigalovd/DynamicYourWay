package com.gimn.yourway.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Form  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8797836666227123188L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@ManyToOne
	private Country country;
	
	private String file;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	public Form() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", country=" + country
				+ ", file=" + file + "]";
	}
	
	
	
}
