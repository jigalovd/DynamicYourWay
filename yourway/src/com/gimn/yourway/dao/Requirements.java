package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Requirements {
	@Id
	@GeneratedValue
	private int id;
	
	private int minAge;
	
	private int maxAge;
	
	private String education;
	
	private String occupation;
	
	private String maritalStatus;
	
	private String religiousBackground;
	
	@OneToMany
	private List<Document> documents;
	
	@OneToMany
	private List<ProgramCustomData> programCustomData;

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligiousBackground() {
		return religiousBackground;
	}

	public void setReligiousBackground(String religiousBackground) {
		this.religiousBackground = religiousBackground;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public int getId() {
		return id;
	}
	
	
}
