package com.gimn.yourway.controller;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.portlet.ModelAndView;

import com.gimn.yourway.dao.Country;
import com.gimn.yourway.dao.Document;
import com.gimn.yourway.dao.DocumentImage;
import com.gimn.yourway.interfaces.RepositoryInterface;

@Controller
public class MainController {
	
	//change to folder you want to store images 
	String path = "I:\\Git\\java\\DynamicYourWay\\yourway\\WebContent\\WEB-INF\\imgVault";
	@Autowired
	RepositoryInterface repository;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(){
		
		return "index";
	}
	@RequestMapping( value="rest/countries",method=RequestMethod.GET)
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
	
	@RequestMapping(value="uploadFile", method = RequestMethod.POST, headers = "content-type=multipart/*")
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file, 
							 @RequestParam("name") String name){
		
		Document doc = new Document();
		if(!file.isEmpty()){
			try {
				
				File docImg = new File(path+name+".jpeg");
				file.transferTo(docImg);
				
				
				doc.setImage(docImg.getName()+ ".jpeg");
				doc.setName(name);
				repository.addDocument(doc);
				return "File: " + " uploaded";
			} catch (IOException e) {
				return "Uploading failed: " + e.getMessage();
			}
		}else {
			return "Uploading failed " + name + " is empty";
		}
		
		
	}
	
	
	
		
		
	
	
	
	
}
