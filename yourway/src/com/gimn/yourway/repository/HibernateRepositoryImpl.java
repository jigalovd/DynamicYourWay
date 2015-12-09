package com.gimn.yourway.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.gimn.yourway.dao.Country;
<<<<<<< HEAD
import com.gimn.yourway.dao.Form;
=======
>>>>>>> branch 'master' of https://github.com/jigalovd/DynamicYourWay.git
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
<<<<<<< HEAD
			em.persist(country);
=======
			em.persist(c);
>>>>>>> branch 'master' of https://github.com/jigalovd/DynamicYourWay.git
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
<<<<<<< HEAD
	
	@Transactional(readOnly=false)
	public void addForm(Form form) {
		Form f = getFormById(form.getId());
		if(f == null)
			em.persist(form);
=======
>>>>>>> branch 'master' of https://github.com/jigalovd/DynamicYourWay.git
		
<<<<<<< HEAD
	}
	
		private Form getFormById(int id){
			Form f = em.find(Form.class, id);
			return f;
		}
	
	public Form getForm(String formName) {
		Query query = em.createQuery("SELECT f FROM Form f WHERE f.name = '"+ formName +"'");
		Form f = (Form)query.getSingleResult();
		return f;
	}
	
	public Iterable<Form> getAllForms() {
		List<Form> res = null;
		Query q = em.createQuery("SELECT f FROM Form f");
		res = q.getResultList();
		return res;
	}
		
=======
>>>>>>> branch 'master' of https://github.com/jigalovd/DynamicYourWay.git
	
	
	
	

}
