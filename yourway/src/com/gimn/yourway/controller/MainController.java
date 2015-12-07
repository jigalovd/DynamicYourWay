package com.gimn.yourway.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gimn.yourway.dao.Address;
import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.FamilyMember;
import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;
import com.gimn.yourway.interfaces.RepositoryInterface;

@Controller
public class MainController {
	
	@Autowired
	RepositoryInterface repository;
	
	@RequestMapping(method=RequestMethod.GET, value="/{countries}/")
	public @ResponseBody Iterable<Country> getCountries(@PathVariable String contries, Model model){
		return repository.getAllCountries();
		
	}
	
	
	
}
