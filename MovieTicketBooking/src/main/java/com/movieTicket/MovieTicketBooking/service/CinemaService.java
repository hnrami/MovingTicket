package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.CinemaRequest;
import com.movieTicket.MovieTicketBooking.entity.Cinema;
import com.movieTicket.MovieTicketBooking.entity.City;
import com.movieTicket.MovieTicketBooking.repository.CinemaRepository;
import com.movieTicket.MovieTicketBooking.repository.CityRepository;

@Service
public class CinemaService {

	@Autowired
	private CinemaRepository repository;

	@Autowired
	private CityRepository cityRepository;

	public Cinema saveCinema(CinemaRequest cinemaRequest) {

		Cinema cinemaDetails = new Cinema();
		City city = cityRepository.findByCityId(cinemaRequest.getCityId());
		cinemaDetails.setCity(city);
		cinemaDetails.setName(cinemaRequest.getName());
		cinemaDetails.setTotalCinemaHalls(cinemaRequest.getTotalCinemaHalls());
		return repository.save(cinemaDetails);
	}

	public List<Cinema> saveCinemas(List<Cinema> cinemas) {
		return repository.saveAll(cinemas);
	}

	public List<Cinema> getCinemas() {
		return repository.findAll();
	}

	public Cinema getCinemaById(int id) {
		return repository.findByCinemaId(id);
	}

	public Cinema getCinemaByName(String name) {
		return repository.findByName(name);
	}

	public String deleteCinema(int id) {
		repository.deleteById(id);
		return "Cinema removed !! " + id;
	}

	public Cinema updateCinema(CinemaRequest cinemaRequest) {
		Cinema cinemaDetails = repository.findByCinemaId(cinemaRequest.getCinemaId());
		City city = cityRepository.findByCityId(cinemaRequest.getCityId());
		cinemaDetails.setCity(city);
		cinemaDetails.setName(cinemaRequest.getName());
		cinemaDetails.setTotalCinemaHalls(cinemaRequest.getTotalCinemaHalls());
		return repository.save(cinemaDetails);
	}

}
