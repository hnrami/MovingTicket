package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.CinemaSeatRequest;
import com.movieTicket.MovieTicketBooking.entity.CinemaHall;
import com.movieTicket.MovieTicketBooking.entity.CinemaSeat;
import com.movieTicket.MovieTicketBooking.repository.CinemaHallRepository;
import com.movieTicket.MovieTicketBooking.repository.CinemaSeatRepository;

@Service
public class CinemaSeatService {

	@Autowired
	private CinemaSeatRepository repository;

	@Autowired
	private CinemaHallRepository cinemaHallRepository;

	public CinemaSeat saveCinemaSeat(CinemaSeatRequest cinemaSeatRequest) {
		
		CinemaSeat cinemaSeatDetails = new CinemaSeat();

		CinemaHall cinemaHall = cinemaHallRepository.findByCinemaHallId(cinemaSeatRequest.getCinemahallId());
		cinemaSeatDetails.setSeatNumber(cinemaSeatRequest.getSeatNumber());
		cinemaSeatDetails.setType(cinemaSeatRequest.getType());
		cinemaSeatDetails.setCinemaHall(cinemaHall);
		return repository.save(cinemaSeatDetails);
	}

	public List<CinemaSeat> saveCinemaSeats(List<CinemaSeat> cinemaSeats) {
		return repository.saveAll(cinemaSeats);
	}

	public List<CinemaSeat> getCinemaSeats() {
		return repository.findAll();
	}

	public CinemaSeat getCinemaSeatById(int id) {
		return repository.findByCinemaSeatId(id);
	}

	public CinemaSeat getCinemaSeatByType(String type) {
		return repository.findByType(type);
	}

	public String deleteCinemaSeat(int id) {
		repository.deleteById(id);
		return "CinemaSeat removed !! " + id;
	}

	public CinemaSeat updateCinemaSeat(CinemaSeatRequest cinemaSeatRequest) {
		CinemaSeat cinemaSeatDetails = repository.findByCinemaSeatId(cinemaSeatRequest.getCinemaSeatId());

		CinemaHall cinemaHall = cinemaHallRepository.findByCinemaHallId(cinemaSeatRequest.getCinemahallId());
		cinemaSeatDetails.setSeatNumber(cinemaSeatRequest.getSeatNumber());
		cinemaSeatDetails.setType(cinemaSeatRequest.getType());
		cinemaSeatDetails.setCinemaHall(cinemaHall);
		return repository.save(cinemaSeatDetails);
	}

}
