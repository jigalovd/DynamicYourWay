package com.gimn.yourway.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Form;
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
		Country c1 = new Country();
		c1.setName("Germany");
		repository.addCountry(c1);
		Form f1 = new Form();
		f1.setFile("filepath");
		f1.setName("formName");
		f1.setCountry(c1);
		
		repository.addForm(f1);
		
		
		
	}

}
