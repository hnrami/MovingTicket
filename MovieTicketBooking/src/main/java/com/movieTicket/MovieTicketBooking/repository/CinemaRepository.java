package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
	
	
	Cinema findByName(String name);

	Cinema findByCinemaId(int cinemaID);

}
