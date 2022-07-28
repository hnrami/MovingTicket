
package com.movieTicket.MovieTicketBooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieTicket.MovieTicketBooking.Request.BookingRequest;
import com.movieTicket.MovieTicketBooking.entity.Booking;
import com.movieTicket.MovieTicketBooking.service.BookingService;

@RestController
public class BookingController {

	
	@Autowired
    private BookingService service;

    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody BookingRequest bookingRequest) {
        return service.saveBooking(bookingRequest);
    }

    @PostMapping("/addbookings")
    public List<Booking> addBookings(@RequestBody List<Booking> bookings) {
        return service.saveBookings(bookings);
    }

    @GetMapping("/bookings")
    public List<Booking> findAllBookings() {
        return service.getBookings();
    }

    @GetMapping("/bookingById/{id}")
    public Booking findBookingById(@PathVariable int id) {
        return service.getBookingById(id);
    }

    @GetMapping("/booking/{status}")
    public Booking findBookingByTitle(@PathVariable String status) {
        return service.getBookingByStatus(status);
    }

    @PutMapping("/booking/update")
    public Booking updateBooking(@RequestBody BookingRequest bookingRequest) {
        return service.updateBooking(bookingRequest);
    }

    @DeleteMapping("/booking/delete/{id}")
    public String deleteBooking(@PathVariable int id) {
        return service.deleteBooking(id);
    }
}
