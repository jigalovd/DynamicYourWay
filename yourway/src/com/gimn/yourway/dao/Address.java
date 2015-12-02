package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int id;
	
	private String street;
	
	private String building;
	
	private int aprt;
	
	private String city;
	
	private String region;
	
	@OneToMany
	private List<Country> countries;

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the aprt
	 */
	public int getAprt() {
		return aprt;
	}

	/**
	 * @param aprt the aprt to set
	 */
	public void setAprt(int aprt) {
		this.aprt = aprt;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the countries
	 */
	public List<Country> getCountries() {
		return countries;
	}

	/**
	 * @param countries the countries to set
	 */
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
}
