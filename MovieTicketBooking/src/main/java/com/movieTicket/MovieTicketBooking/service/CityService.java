package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.entity.City;
import com.movieTicket.MovieTicketBooking.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;

	public City saveCity(City city) {
		return repository.save(city);
	}

	public List<City> saveCitys(List<City> citys) {
		return repository.saveAll(citys);
	}

	public List<City> getCitys() {
		return repository.findAll();
	}

	public City getCityById(int id) {
		return repository.findByCityId(id);
	}

	public City getCityByName(String name) {
		return repository.findByName(name);
	}

	public String deleteCity(int id) {
		repository.deleteById(id);
		return "City removed !! " + id;
	}

	public City updateCity(City city) {
		City cityDetails = repository.findByCityId(city.getCityId());
		cityDetails.setName(city.getName());
		cityDetails.setState(city.getState());
		cityDetails.setZipcode(city.getZipcode());

		return repository.save(cityDetails);
	}

}
