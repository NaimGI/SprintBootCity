package com.nadhem.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.produits.entities.City;

import com.nadhem.produits.service.CityService;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class CountryRESTController {
	  @Autowired
	   CityService  cityService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<City> getAllCity()
	{
		return cityService.getAllCity();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public City  getCityById(@PathVariable("id") Long id) {
		return cityService.getCity(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public City createCountry(@RequestBody City city) {
			return cityService.saveCity(city);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteCity(@PathVariable("id") Long id)
	{
		cityService.deleteCityById(id);
	}
	@RequestMapping(value="/Councat/{idContry}",method = RequestMethod.GET)
	public List<City> getCountryByCatId(@PathVariable("idCountry") Long idCountry) {
		return cityService .findByCountryId(idCountry);
	}
}
