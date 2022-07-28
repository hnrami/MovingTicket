package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.CinemaHallRequest;
import com.movieTicket.MovieTicketBooking.entity.Cinema;
import com.movieTicket.MovieTicketBooking.entity.CinemaHall;
import com.movieTicket.MovieTicketBooking.repository.CinemaHallRepository;
import com.movieTicket.MovieTicketBooking.repository.CinemaRepository;

@Service
public class CinemaHallService {

	@Autowired
	private CinemaHallRepository repository;

	@Autowired
	private CinemaRepository cinemaRepository;

	public CinemaHall saveCinemaHall(CinemaHallRequest cinemaHallRequest) {

		CinemaHall cinemaHallDetails = new CinemaHall();
		Cinema cinema = cinemaRepository.findByCinemaId(cinemaHallRequest.getCinemaId());

		cinemaHallDetails.setName(cinemaHallRequest.getName());
		cinemaHallDetails.setTotalSeats(cinemaHallRequest.getTotalSeats());
		cinemaHallDetails.setCinema(cinema);
		return repository.save(cinemaHallDetails);
	}

	public List<CinemaHall> saveCinemaHalls(List<CinemaHall> cinemaHalls) {
		return repository.saveAll(cinemaHalls);
	}

	public List<CinemaHall> getCinemaHalls() {
		return repository.findAll();
	}

	public CinemaHall getCinemaHallById(int id) {
		return repository.findByCinemaHallId(id);
	}

	public CinemaHall getCinemaHallByName(String name) {
		return repository.findByName(name);
	}

	public String deleteCinemaHall(int id) {
		repository.deleteById(id);
		return "CinemaHall removed !! " + id;
	}

	public CinemaHall updateCinemaHall(CinemaHallRequest cinemaHallRequest) {
		CinemaHall cinemaHallDetails = repository.findByCinemaHallId(cinemaHallRequest.getCinemaHallId());
		Cinema cinema = cinemaRepository.findByCinemaId(cinemaHallRequest.getCinemaId());

		cinemaHallDetails.setName(cinemaHallRequest.getName());
		cinemaHallDetails.setTotalSeats(cinemaHallRequest.getTotalSeats());
		cinemaHallDetails.setCinema(cinema);

		return repository.save(cinemaHallDetails);
	}

}
