package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.Request.ShowSeatRequest;
import com.movieTicket.MovieTicketBooking.entity.Booking;
import com.movieTicket.MovieTicketBooking.entity.CinemaSeat;
import com.movieTicket.MovieTicketBooking.entity.Show;
import com.movieTicket.MovieTicketBooking.entity.ShowSeat;
import com.movieTicket.MovieTicketBooking.repository.BookingRepository;
import com.movieTicket.MovieTicketBooking.repository.CinemaSeatRepository;
import com.movieTicket.MovieTicketBooking.repository.ShowRepository;
import com.movieTicket.MovieTicketBooking.repository.ShowSeatRepository;

@Service
public class ShowSeatService {

	@Autowired
	private ShowSeatRepository repository;

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private ShowRepository showRepository;

	@Autowired
	private CinemaSeatRepository cinemaSeatRepository;

	public ShowSeat saveShowSeat(ShowSeatRequest showSeatRequest) {
		
ShowSeat showSeatDetails = new ShowSeat();
		
		Booking booking = bookingRepository.findBybookingId(showSeatRequest.getBookingId());
		CinemaSeat cinemaSeat = cinemaSeatRepository.findByCinemaSeatId(showSeatRequest.getCinemaSeatId());
		Show show = showRepository.findByShowId(showSeatRequest.getShowId());

		showSeatDetails.setBooking(booking);
		showSeatDetails.setCinemaSeat(cinemaSeat);
		showSeatDetails.setPrice(showSeatRequest.getPrice());
		showSeatDetails.setShow(show);
		showSeatDetails.setStatus(showSeatRequest.getStatus());
		return repository.save(showSeatDetails);
	}

	public List<ShowSeat> saveShowSeats(List<ShowSeat> movies) {
		return repository.saveAll(movies);
	}

	public List<ShowSeat> getShowSeats() {
		return repository.findAll();
	}

	public ShowSeat getShowSeatById(int id) {
		return repository.findByShowSeatId(id);
	}

	public String deleteShowSeat(int id) {
		repository.deleteById(id);
		return "ShowSeat removed !! " + id;
	}

	public ShowSeat updateShowSeat(ShowSeatRequest showSeatRequest) {
		ShowSeat showSeatDetails = repository.findByShowSeatId(showSeatRequest.getShowSeatId());
		
		Booking booking = bookingRepository.findBybookingId(showSeatRequest.getBookingId());
		CinemaSeat cinemaSeat = cinemaSeatRepository.findByCinemaSeatId(showSeatRequest.getCinemaSeatId());
		Show show = showRepository.findByShowId(showSeatRequest.getShowId());

		showSeatDetails.setBooking(booking);
		showSeatDetails.setCinemaSeat(cinemaSeat);
		showSeatDetails.setPrice(showSeatRequest.getPrice());
		showSeatDetails.setShow(show);
		showSeatDetails.setStatus(showSeatRequest.getStatus());
		return repository.save(showSeatDetails);
	}

}
