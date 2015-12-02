package com.gimn.yourway.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;
import com.gimn.yourway.interfaces.RepositoryInterface;

public class HibernateRepositoryImpl implements RepositoryInterface{
	
	@PersistenceContext(unitName="yourwayDB")
	EntityManager em;
	
	@Transactional(readOnly=false)
	public void addPerson(Person person) {
		Person p = getPersonById(person.getId());
		if(p == null)
			em.persist(person);
		
	}
		private Person getPersonById(int id){
			Person p = em.find(Person.class, id);
			return p;
		}
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void removePerson(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	public void addPersonData(PersonData personData) {
		// TODO Auto-generated method stub
		
	}

	
	
	public List<PersonData> listPersonData() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void removePersonDataByID(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	public void removePersonDataByPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

}
