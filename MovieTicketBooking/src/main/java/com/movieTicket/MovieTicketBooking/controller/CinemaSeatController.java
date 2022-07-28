
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

import com.movieTicket.MovieTicketBooking.Request.CinemaSeatRequest;
import com.movieTicket.MovieTicketBooking.entity.CinemaSeat;
import com.movieTicket.MovieTicketBooking.entity.Movie;
import com.movieTicket.MovieTicketBooking.service.CinemaSeatService;
import com.movieTicket.MovieTicketBooking.service.MovieService;

@RestController
public class CinemaSeatController {

	
	@Autowired
    private CinemaSeatService service;

    @PostMapping("/addCinemaSeat")
    public CinemaSeat addCinemaSeat(@RequestBody CinemaSeatRequest cinemaSeatRequest) {
        return service.saveCinemaSeat(cinemaSeatRequest);
    }

    @PostMapping("/addCinemaSeats")
    public List<CinemaSeat> addCinemaSeats(@RequestBody List<CinemaSeat> CinemaSeats) {
        return service.saveCinemaSeats(CinemaSeats);
    }

    @GetMapping("/cinemaSeats")
    public List<CinemaSeat> findAllMovies() {
        return service.getCinemaSeats();
    }

    @GetMapping("/cinemaSeatById/{id}")
    public CinemaSeat findCinemaSeatById(@PathVariable int id) {
        return service.getCinemaSeatById(id);
    }

    @GetMapping("/cinemaSeat/{type}")
    public CinemaSeat findCinemaSeatByType(@PathVariable String type) {
        return service.getCinemaSeatByType(type);
    }

    @PutMapping("/cinemaSeat/update")
    public CinemaSeat updateCinemaSeat(@RequestBody CinemaSeatRequest cinemaSeatRequest) {
        return service.updateCinemaSeat(cinemaSeatRequest);
    }

    @DeleteMapping("/cinemaSeat/delete/{id}")
    public String deleteCinemaSeat(@PathVariable int id) {
        return service.deleteCinemaSeat(id);
    }
}
