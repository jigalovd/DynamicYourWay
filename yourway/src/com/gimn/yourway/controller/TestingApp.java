package com.gimn.yourway.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.interfaces.RepositoryInterface;

public class TestingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		RepositoryInterface repository = (RepositoryInterface) context.getBean("repository");
		
		Country c1 = new Country();
		c1.setName("Russia");
		repository.addCountry(c1);
	}

}
