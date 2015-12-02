package com.gimn.yourway.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonCustomData {
	@Id
	@GeneratedValue
	private int id;
	
	
}
