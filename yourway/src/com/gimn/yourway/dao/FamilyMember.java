package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class FamilyMember {
	
	/*-------------- Fields ----------------*/
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	
	private String relation;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PersonData personData;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Person> relatedPersons;
	
	/*-------------- Constructors ----------------*/
	
	public FamilyMember() {}
	
	
	public FamilyMember(String relation, PersonData personData) {
		super();
		this.relation = relation;
		this.personData = personData;
	}


	/*-------------- Methods ----------------*/
	
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public PersonData getPersonData() {
		return personData;
	}

	public void setPersonData(PersonData personData) {
		this.personData = personData;
	}
	
	
	public List<Person> getRelatedPersons() {
		return relatedPersons;
	}


	public void setRelatedPersons(List<Person> relatedPersons) {
		this.relatedPersons = relatedPersons;
	}


	public int getId() {
		return id;
	}
	
	
	
	
	
	

}
