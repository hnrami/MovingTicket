package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat,Integer> {
	
	

	ShowSeat findByShowSeatId(int showSeatId);

}
