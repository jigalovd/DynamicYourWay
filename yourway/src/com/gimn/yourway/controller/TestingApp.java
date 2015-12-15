package com.gimn.yourway.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Document;
import com.gimn.yourway.dao.DocumentImage;
import com.gimn.yourway.interfaces.RepositoryInterface;

public class TestingApp {
	private static Map<String, Object> countryToMap(Country country){
		Map<String, Object> map = null;
		
			map.put("id", country.getId());
			map.put("link", country.getLink());
		
		return map;
		
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		RepositoryInterface repository = (RepositoryInterface) context.getBean("repository");
		DocumentImage img = repository.getDocumentImgByName("img1");
		Document doc = repository.getDocument("doc1");
		System.out.println(img.getImageName());
		System.out.println(doc.getName());
		//repository.saveDocumentImage(dImg);
		
		
		
	}

}
