package com.gimn.yourway.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;


@Entity
public class Person {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	//unique user name
	
	private String eMail;
	
	
	private String password;
	
	
	@Temporal(value = TemporalType.DATE)
	private Date registrationDate;
	
	
	@Temporal(value = TemporalType.TIME)
	private Date lastLogin;
	
	


	//person data object
	@OneToOne(cascade=CascadeType.ALL)
	private PersonData personData;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<FamilyMember> familyMembers; 
	
	/*-------------- Constructors ----------------*/
	public Person() {}
	
	public Person(String eMail, String password, Date registrationDate,
			Date lastLogin, PersonData personData) {
		super();
		this.eMail = eMail;
		this.password = password;
		this.registrationDate = registrationDate;
		this.lastLogin = lastLogin;
		this.personData = personData;
	}




	/*-------------- Methods ----------------*/
	
	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}


	public Date getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	
	public PersonData getPersonData() {
		return personData;
	}


	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}

	public List<FamilyMember> getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(List<FamilyMember> familyMembers) {
		this.familyMembers = familyMembers;
	}
	
	public int getId() {
		return id;
	}
}
