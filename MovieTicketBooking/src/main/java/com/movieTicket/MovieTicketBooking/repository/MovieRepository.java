package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
	
	
	Movie findByTitle(String title);

	Movie findByMovieId(int movieID);

}
