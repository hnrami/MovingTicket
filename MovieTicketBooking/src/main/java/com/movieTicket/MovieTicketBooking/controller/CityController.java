
package com.movieTicket.MovieTicketBooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieTicket.MovieTicketBooking.entity.City;
import com.movieTicket.MovieTicketBooking.service.CityService;

@RestController
public class CityController {

	
	@Autowired
    private CityService service;

    @PostMapping("/addCity")
    public City addCity(@RequestBody City city) {
        return service.saveCity(city);
    }

    @PostMapping("/addCities")
    public List<City> addMovies(@RequestBody List<City> cities) {
        return service.saveCitys(cities);
    }

    @GetMapping("/cities")
    public List<City> findAllCitys() {
        return service.getCitys();
    }

    @GetMapping("/cityById/{id}")
    public City findCityById(@PathVariable int id) {
        return service.getCityById(id);
    }

    @GetMapping("/city/{name}")
    public City findCityByName(@PathVariable String name) {
        return service.getCityByName(name);
    }

    @PutMapping("/city/update")
    public City updateCity(@RequestBody City Movie) {
        return service.updateCity(Movie);
    }

    @DeleteMapping("/city/delete/{id}")
    public String deleteCity(@PathVariable int id) {
        return service.deleteCity(id);
    }
}
