package com.gimn.yourway.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Program {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String category;
	
	private String link;
	
	private String description;
	
	@OneToMany
	private List<ProgramCustomData> customData;
	
	public Program(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public int getId() {
		return id;
	}
	
	
}
