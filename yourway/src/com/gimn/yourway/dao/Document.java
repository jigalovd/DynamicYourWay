package com.gimn.yourway.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.openjpa.persistence.jdbc.Unique;

@Entity
public class Document implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4667520718518308778L;


	@Id
	@GeneratedValue
	private int id;
	
	
	private String name;
	
	private String type;
	
	@OneToOne
	private DocumentImage documentImage;
	
	//path to the image of the document( for form only )
	private String image;
	
	private int pageNumber;
	
	@OneToMany
	private List<DocumentField> fields; 
	
	public Document(){}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @return the fields
	 */
	public List<DocumentField> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<DocumentField> fields) {
		this.fields = fields;
	}
	
	

	/**
	 * @return the documentImage
	 */
	public DocumentImage getDocumentImage() {
		return documentImage;
	}

	/**
	 * @param documentImage the documentImage to set
	 */
	public void setDocumentImage(DocumentImage documentImage) {
		this.documentImage = documentImage;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", type=" + type
				+ ", documentImage=" + documentImage + ", image=" + image
				+ ", pageNumber=" + pageNumber + ", fields=" + fields + "]";
	}
	
	
	
}
