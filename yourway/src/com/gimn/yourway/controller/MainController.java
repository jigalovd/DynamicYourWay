package com.gimn.yourway.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	
	@RequestMapping(value="uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file){
		String path = "I:\\Git\\java\\DynamicYourWay\\yourway\\WebContent\\WEB-INF\\imgVault";
		String fileName = null;
		if(!file.isEmpty()){
			try{
				byte[] bytes = file.getBytes();
				fileName = file.getOriginalFilename();
				File dir = new File(path + File.separator + "uploadedImages");
				
				if(!dir.exists())
					dir.mkdir();
				
				File uploadedFile = new File(dir.getAbsolutePath() + File.separator + fileName);
				
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
				stream.write(bytes);
				stream.flush();
				stream.close();
				
				return "File"+ fileName + " uploaded";
			}catch(Exception e){
				return "Uploading failed" + e.getMessage();
			}
		}else {
			return "Uploading failed " + fileName + " is empty";
		}
		
		
	}
	
	
	
		
		
	
	
	
	
}
