package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.Show;

public interface ShowRepository extends JpaRepository<Show,Integer> {
	
	

	Show findByShowId(int showId);

}
