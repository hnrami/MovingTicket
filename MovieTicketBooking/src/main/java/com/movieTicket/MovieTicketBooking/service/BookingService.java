package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.BookingRequest;
import com.movieTicket.MovieTicketBooking.entity.Booking;
import com.movieTicket.MovieTicketBooking.entity.Show;
import com.movieTicket.MovieTicketBooking.entity.User;
import com.movieTicket.MovieTicketBooking.repository.BookingRepository;
import com.movieTicket.MovieTicketBooking.repository.ShowRepository;
import com.movieTicket.MovieTicketBooking.repository.UserRepository;

@Service
public class BookingService {
	
	
		@Autowired
	    private BookingRepository repository;
		
		@Autowired
		private UserRepository userRepository;
		
		@Autowired
		private ShowRepository showRepository;

	public Booking saveBooking(BookingRequest bookingRequest) {

		User user = userRepository.findByUserId(bookingRequest.getUserid());
		Show show = showRepository.findByShowId(bookingRequest.getShowid());
		Booking bookingDetails = new Booking();
		bookingDetails.setNumberOfSeats(bookingRequest.getNumberOfSeats());
		bookingDetails.setStatus(bookingRequest.getStatus());
		bookingDetails.setTimeStamp(bookingRequest.getTimeStamp());
		bookingDetails.setUser(user);
		bookingDetails.setShow(show);

		return repository.save(bookingDetails);
	}

	    public List<Booking> saveBookings(List<Booking> bookings) {
	        return repository.saveAll(bookings);
	    }

	    public List<Booking> getBookings() {
	        return repository.findAll();
	    }

	    public Booking getBookingById(int id) {
	        return repository.findBybookingId(id);
	    }

	    public Booking getBookingByStatus(String status) {
	        return repository.findByStatus(status);
	    }

	    public String deleteBooking(int id) {
	        repository.deleteById(id);
	        return "Booking removed !! " + id;
	    }

	public Booking updateBooking(BookingRequest bookingRequest) {
		Booking bookingDetails = repository.findBybookingId(bookingRequest.getBookingid());

		User user = userRepository.findByUserId(bookingRequest.getUserid());

		Show show = showRepository.findByShowId(bookingRequest.getShowid());

		if (show != null && user != null && bookingDetails != null) {

			bookingDetails.setNumberOfSeats(bookingRequest.getNumberOfSeats());
			bookingDetails.setStatus(bookingRequest.getStatus());
			bookingDetails.setTimeStamp(bookingRequest.getTimeStamp());
			bookingDetails.setUser(user);
			bookingDetails.setShow(show);
			return repository.save(bookingDetails);

		}
		return bookingDetails;

	}


}
