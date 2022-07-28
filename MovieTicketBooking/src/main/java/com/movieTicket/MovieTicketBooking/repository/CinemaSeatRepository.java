package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.CinemaSeat;

public interface CinemaSeatRepository extends JpaRepository<CinemaSeat,Integer> {
	
	
	CinemaSeat findByType(String type);

	CinemaSeat findByCinemaSeatId(int cinemaSeatID);

}
