package com.gimn.yourway.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;
import com.gimn.yourway.interfaces.RepositoryInterface;

public class HibernateRepositoryImpl implements RepositoryInterface{
	
	@PersistenceContext(unitName="yourwayDB")
	EntityManager em;
	
		
	@Transactional(readOnly=false)
	public void addCountry(Country country) {
		Country c = getCountryById(country.getId());
		if(c==null)
			em.persist(country);
	}
		private Country getCountryById(int id){
			Country c = em.find(Country.class, id);
			return c;
		}
	
	public Iterable<Country> getAllCountries() {
		List<Country> res = null;
		Query q = em.createQuery("SELECT c FROM Country c");
		res = q.getResultList();
		return res;
	}
	
	public Country getCountry(String countryName) {
		Query query = em.createQuery("SELECT c FROM Country c WHERE c.name = '"+countryName+"'");
		Country c = (Country)query.getSingleResult();
		return c;
	}
		
	
	
	
	

}
