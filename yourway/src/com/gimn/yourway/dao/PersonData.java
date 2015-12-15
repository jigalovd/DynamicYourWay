package com.gimn.yourway.dao;

import java.util.Date;


import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PersonData {
/*-------------- Fields ----------------*/
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	private String identity;
	
	@Temporal(value = TemporalType.DATE)
	private Date birthDate;
	
	private String firstName;
	
	private String lastName;
	
	private char gender;
	
	private String familyStatus;
	
	private String workPhone;
	private String mobilePhone;
	private String homePhone;
	
	private String occupation;
	
	private String education;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
	
	@OneToOne
	private Country birthPlace;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Country> citezenship;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PersonCustomData> personCustomData;
	
	/*-------------- Constructors ----------------*/
	public PersonData() {}
	
		
	/*-------------- Methods ----------------*/
	
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getFamilyStatus() {
		return familyStatus;
	}

	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}

	public Country getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(Country birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Set<Country> getCitezenship() {
		return citezenship;
	}

	public void setCitezenship(Set<Country> citezenship) {
		this.citezenship = citezenship;
	}

	
	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the personCustomData
	 */
	public List<PersonCustomData> getPersonCustomData() {
		return personCustomData;
	}

	/**
	 * @param personCustomData the personCustomData to set
	 */
	public void setPersonCustomData(List<PersonCustomData> personCustomData) {
		this.personCustomData = personCustomData;
	}

	public int getId() {
		return id;
	}

}
