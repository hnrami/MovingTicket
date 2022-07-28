package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
	
	
	Booking findByStatus(String status);

	Booking findBybookingId(int bookingId);

}
