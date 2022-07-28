package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.PaymentRequest;
import com.movieTicket.MovieTicketBooking.entity.Booking;
import com.movieTicket.MovieTicketBooking.entity.Payment;
import com.movieTicket.MovieTicketBooking.repository.BookingRepository;
import com.movieTicket.MovieTicketBooking.repository.PaymentRepository;

@Service
public class PaymentService {
	
	
		@Autowired
		private PaymentRepository repository;
		
		@Autowired
		private BookingRepository bookingRepository;

	    public Payment savePayment(PaymentRequest paymentRequest) {
	    	
	    	Payment paymentDetails = new Payment();
	        Booking booking = bookingRepository.findBybookingId(paymentRequest.getBookingId());
	        paymentDetails.setAmount(paymentRequest.getAmount());
	        paymentDetails.setBooking(booking);
	        paymentDetails.setDiscountCouponId(paymentRequest.getDiscountCouponId());
	        paymentDetails.setPaymentMethod(paymentRequest.getPaymentMethod());
	        paymentDetails.setRemoteTansactionId(paymentRequest.getRemoteTansactionId());
	        paymentDetails.setTimeStamp(paymentRequest.getTimeStamp());
	        
	        return repository.save(paymentDetails);
	    }

	    public List<Payment> savePayments(List<Payment> movies) {
	        return repository.saveAll(movies);
	    }

	    public List<Payment> getPayments() {
	        return repository.findAll();
	    }

	    public Payment getPaymentById(int id) {
	        return repository.findByPaymentId(id);
	    }

	    public Payment getPaymentByPaymentMethod(String paymentMethod) {
	        return repository.findByPaymentMethod(paymentMethod);
	    }

	    public String deletePayment(int id) {
	        repository.deleteById(id);
	        return "Payment removed !! " + id;
	    }

	    public Payment updatePayment(PaymentRequest paymentRequest) {
	        Payment paymentDetails = repository.findByPaymentId(paymentRequest.getPaymentId());
	        Booking booking = bookingRepository.findBybookingId(paymentRequest.getBookingId());
	        paymentDetails.setAmount(paymentRequest.getAmount());
	        paymentDetails.setBooking(booking);
	        paymentDetails.setDiscountCouponId(paymentRequest.getDiscountCouponId());
	        paymentDetails.setPaymentMethod(paymentRequest.getPaymentMethod());
	        paymentDetails.setRemoteTansactionId(paymentRequest.getRemoteTansactionId());
	        paymentDetails.setTimeStamp(paymentRequest.getTimeStamp());
	        
	        return repository.save(paymentDetails);
	    }


}
