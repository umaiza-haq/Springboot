package com.boot.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.City;
import com.respositories.CityRespository;

@Service
public class DataService {

	
	@Autowired
	CityRespository cityrepo;
	
	
	public List<City> getCity(String countrycode){
		return (List<City>)cityrepo.getCityByCountrycode(countrycode);
	}
	
	
	public List<City> getCity(){
		return (List<City>) cityrepo.findAll();
	}
	
	
	
	public List<City> getCities(String pattern)
	{
		return cityrepo.getCities("%"+pattern.toLowerCase()+"%");
	}
	 
	
	
	public Map<String,String[]> names(){
	
		String[] names= {"Nirmal","Harry","Praveen","Raju","Arjun"};
		String[] names2 = {"Shan","Johan","paul"};
		Map<String,String[]> map = new HashMap<String,String[]>();
		map.put("teams1", names);
		map.put("teams2", names2);
		return map;
	}
	}

