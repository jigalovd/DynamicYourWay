package com.gimn.yourway.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DocumentImage  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8797836666227123188L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private String imageName;
	
	private byte[] imageFile ;
	
	@OneToMany
	private List<Document> relatedDocuments = new ArrayList<Document>();
	
	public DocumentImage() {
		
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * @return the imageFile
	 */
	public byte[] getImageFile() {
		return imageFile;
	}

	/**
	 * @param imageFile the imageFile to set
	 */
	public void setImageFile(byte[] imageFile) {
		this.imageFile = imageFile;
	}

	
	/**
	 * @return the relatedDocuments
	 */
	public List<Document> getRelatedDocuments() {
		return relatedDocuments;
	}

	/**
	 * @param relatedDocuments the relatedDocuments to set
	 */
	public void setRelatedDocuments(List<Document> relatedDocuments) {
		this.relatedDocuments = relatedDocuments;
	}
	
	public void addRelatedDocument(Document document){
		relatedDocuments.add(document);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	

	
	
	
	
}
