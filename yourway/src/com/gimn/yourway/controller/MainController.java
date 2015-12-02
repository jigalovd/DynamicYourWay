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

import com.gimn.yourway.dao.Address;
import com.gimn.yourway.dao.FamilyMember;
import com.gimn.yourway.dao.Person;
import com.gimn.yourway.dao.PersonData;
import com.gimn.yourway.interfaces.RepositoryInterface;

@Controller
public class MainController {
	
	@Autowired
	RepositoryInterface repository;
	
	
}
