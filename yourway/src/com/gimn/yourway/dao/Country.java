package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String link;
	
	@OneToMany
	private List<Embassy> embassies;
	
	@OneToMany
	private List<Program> programms; 

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
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the embassies
	 */
	public List<Embassy> getEmbassies() {
		return embassies;
	}

	/**
	 * @param embassies the embassies to set
	 */
	public void setEmbassies(List<Embassy> embassies) {
		this.embassies = embassies;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	} 
	
	

}
