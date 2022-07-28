
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

import com.movieTicket.MovieTicketBooking.Request.ShowSeatRequest;
import com.movieTicket.MovieTicketBooking.entity.Movie;
import com.movieTicket.MovieTicketBooking.entity.ShowSeat;
import com.movieTicket.MovieTicketBooking.service.MovieService;
import com.movieTicket.MovieTicketBooking.service.ShowSeatService;
import com.movieTicket.MovieTicketBooking.service.ShowService;

@RestController
public class ShowSeatController {

	
	@Autowired
    private ShowSeatService service;

    @PostMapping("/addShowSeat")
    public ShowSeat addShowSeat(@RequestBody ShowSeatRequest showSeatRequest) {
        return service.saveShowSeat(showSeatRequest);
    }

    @PostMapping("/addShowSeats")
    public List<ShowSeat> addShowSeats(@RequestBody List<ShowSeat> ShowSeats) {
        return service.saveShowSeats(ShowSeats);
    }

    @GetMapping("/showSeats")
    public List<ShowSeat> findAllShowSeats() {
        return service.getShowSeats();
    }

    @GetMapping("/showSeatById/{id}")
    public ShowSeat findShowSeatById(@PathVariable int id) {
        return service.getShowSeatById(id);
    }

 

    @PutMapping("/showSeats/update")
    public ShowSeat updateShowSeat(@RequestBody ShowSeatRequest showSeatRequest) {
        return service.updateShowSeat(showSeatRequest);
    }

    @DeleteMapping("/showSeats/delete/{id}")
    public String deleteShowSeat(@PathVariable int id) {
        return service.deleteShowSeat(id);
    }
}
