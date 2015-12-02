package com.gimn.yourway.interfaces;

import java.util.List;

import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;

public interface RepositoryInterface {
	
	public void addPerson(Person person);
	
	public List<Person> listPersons();
	
	public void removePerson(Integer id);
	
	public void addPersonData(PersonData personData);
	
	public List<PersonData> listPersonData();
	
	public void removePersonDataByID(Integer id);
	
	public void removePersonDataByPerson(Person person);
	

}
