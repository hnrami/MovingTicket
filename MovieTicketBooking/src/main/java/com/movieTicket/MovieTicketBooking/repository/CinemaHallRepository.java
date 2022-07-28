package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.CinemaHall;

public interface CinemaHallRepository extends JpaRepository<CinemaHall,Integer> {
	
	
	CinemaHall findByName(String name);

	CinemaHall findByCinemaHallId(int cinemaHallId);

}
