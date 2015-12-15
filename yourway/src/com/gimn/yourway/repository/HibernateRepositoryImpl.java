package com.gimn.yourway.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Document;
import com.gimn.yourway.dao.DocumentImage;
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
		em.persist(c);

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

	
	@Transactional(readOnly=false)
	public void addDocument(Document document) {
		Document f = getDocumentById(document.getId());
		if(f == null)
			em.persist(document);

	}
	
		private Document getDocumentById(int id){
			Document f = em.find(Document.class, id);
			return f;
		}
	
	public Document getDocument(String documentName) {
		Query query = em.createQuery("SELECT d FROM Document d WHERE d.name = '"+ documentName +"'");
		Document d = (Document)query.getSingleResult();
		return d;
	}
	
	public Iterable<Document> getAllDocuments() {
		Iterable<Document> res = new ArrayList<Document>();
		Query q = em.createQuery("SELECT d FROM Document d");
		res = q.getResultList();
		return res;
	}
	
	
	@Transactional(readOnly=false)
	public void saveDocumentImage(DocumentImage image) {
		DocumentImage img = getDocImageById(image.getId());
		if(img==null)
			em.persist(image);
		else
			System.out.println("Document image allready exist");
		
	}
		private DocumentImage getDocImageById(int id){
			DocumentImage image = em.find(DocumentImage.class, id);
			return image;
		}
	
	public DocumentImage getDocumentImgByName(String imgName) {
		
		Query q = em.createQuery("SELECT i FROM DocumentImage i WHERE i.imageName = '" + imgName + "'");
		DocumentImage docImg =(DocumentImage) q.getSingleResult();
		return docImg;
	}

	
	public Iterable<Document> getRelatedDocumentsByImg(DocumentImage docImg) {
		Iterable<Document> res = new ArrayList<Document>();
		Query q = em.createQuery("SELECT doc FROM Document doc, IN(doc.relatedDocuments) relDocs  ");
		res = q.getResultList();
		return res;
		
		
	}

	
		

	
	
	
	

}
