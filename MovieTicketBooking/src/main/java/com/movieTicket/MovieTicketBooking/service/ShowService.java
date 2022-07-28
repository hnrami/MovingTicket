package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.ShowRequest;
import com.movieTicket.MovieTicketBooking.entity.CinemaHall;
import com.movieTicket.MovieTicketBooking.entity.Movie;
import com.movieTicket.MovieTicketBooking.entity.Show;
import com.movieTicket.MovieTicketBooking.repository.CinemaHallRepository;
import com.movieTicket.MovieTicketBooking.repository.MovieRepository;
import com.movieTicket.MovieTicketBooking.repository.ShowRepository;

@Service
public class ShowService {

	@Autowired
	private ShowRepository repository;

	@Autowired
	private CinemaHallRepository cinemaHallRepository;

	@Autowired
	private MovieRepository movieRepository;

	public Show saveShow(ShowRequest showRequest) {

		Show showDetails = new Show();
		CinemaHall cinemaHall = cinemaHallRepository.findByCinemaHallId(showRequest.getCinemaHallId());
		Movie movie = movieRepository.findByMovieId(showRequest.getMovieId());

		showDetails.setCinemaHall(cinemaHall);
		showDetails.setDate(showRequest.getDate());
		showDetails.setEmdTime(showRequest.getEmdTime());
		showDetails.setMovie(movie);
		showDetails.setShowId(showRequest.getShowId());
		showDetails.setStartTime(showRequest.getStartTime());

		return repository.save(showDetails);
	}

	public List<Show> saveShows(List<Show> shows) {
		return repository.saveAll(shows);
	}

	public List<Show> getShows() {
		return repository.findAll();
	}

	public Show getShowById(int id) {
		return repository.findByShowId(id);
	}

	public String deleteShow(int id) {
		repository.deleteById(id);
		return "Show removed !! " + id;
	}

	public Show updateShow(ShowRequest showRequest) {
		Show showDetails = repository.findByShowId(showRequest.getShowId());
		CinemaHall cinemaHall = cinemaHallRepository.findByCinemaHallId(showRequest.getCinemaHallId());
		Movie movie = movieRepository.findByMovieId(showRequest.getMovieId());

		showDetails.setCinemaHall(cinemaHall);
		showDetails.setDate(showRequest.getDate());
		showDetails.setEmdTime(showRequest.getEmdTime());
		showDetails.setMovie(movie);
		showDetails.setShowId(showRequest.getShowId());
		showDetails.setStartTime(showRequest.getStartTime());

		return repository.save(showDetails);
	}

}
