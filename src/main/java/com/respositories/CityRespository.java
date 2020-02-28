package com.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import com.model.City;

public interface CityRespository extends CrudRepository<City,Long> {
	
@Query("from City where lower(name) like :pattern")
public List<City> getCities(@Param("pattern")String pattern);

public List<City>getCityByCountrycode(String countrycode);

}
