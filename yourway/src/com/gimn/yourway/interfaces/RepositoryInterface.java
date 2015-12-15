package com.gimn.yourway.interfaces;

import java.util.List;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Document;
import com.gimn.yourway.dao.DocumentImage;
import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;

public interface RepositoryInterface {
	
	/*Person methods
	public void addPerson(Person person);
	
	public List<Person> listPersons();
	
	public void removePerson(Integer id);
	
	public void addPersonData(PersonData personData);
	
	public List<PersonData> listPersonData();
	
	public void removePersonDataByID(Integer id);
	
	public void removePersonDataByPerson(Person person);
	*/
	
	/*Country methods*/
	public void addCountry(Country country);
	
	public Iterable<Country> getAllCountries();
	
	public Country getCountry(String countryName);
	

	
	/*Document methods*/
	public void addDocument(Document document);
	
	public Document getDocument(String documentName);
	
	public Iterable<Document> getAllDocuments();
	
	/*Save DocumentImage instance to DB*/
	public void saveDocumentImage(DocumentImage image);
	
	/*Image upload for Document class*/
	public DocumentImage getDocumentImgByName(String imgName);
	
	public Iterable<Document> getRelatedDocumentsByImg(DocumentImage docImg);
	
	
	
	
	
	
}
