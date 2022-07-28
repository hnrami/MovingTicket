package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
	
	
	Payment findByPaymentMethod(String paymentMethod);

	Payment findByPaymentId(int paymentID);

}
