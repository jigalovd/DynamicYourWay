package com.gimn.yourway.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.interfaces.RepositoryInterface;

@Controller
@RequestMapping(value="rest")
public class MainController {
	
	@Autowired
	RepositoryInterface repository;
	
	@RequestMapping( value="countries",method=RequestMethod.GET)
	public @ResponseBody List<Map> getCountries(){
		List<Map> res = new LinkedList<Map>();
		Iterable<Country> countryList = repository.getAllCountries();
		for(Country c : countryList){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", c.getId());
			map.put("name", c.getName());
			res.add(map);
		}
		return res;
		
	}
	
	
	
		
		
	
	
	
}
