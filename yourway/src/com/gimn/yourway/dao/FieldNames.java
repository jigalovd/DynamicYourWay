package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FieldNames {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	//must be JSON
	private String possibleValues;
	
	@OneToMany
	private List<PersonCustomData> personValues;
	
	@OneToMany
	private List<ProgramCustomData> programValues;

	//----------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(String possibleValues) {
		this.possibleValues = possibleValues;
	}

	public List<PersonCustomData> getPersonValues() {
		return personValues;
	}

	public void setPersonValues(List<PersonCustomData> personValues) {
		this.personValues = personValues;
	}

	public List<ProgramCustomData> getProgramValues() {
		return programValues;
	}

	public void setProgramValues(List<ProgramCustomData> programValues) {
		this.programValues = programValues;
	}

	public int getId() {
		return id;
	}
	
	
}
