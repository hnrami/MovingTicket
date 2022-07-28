
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

import com.movieTicket.MovieTicketBooking.Request.CinemaRequest;
import com.movieTicket.MovieTicketBooking.entity.Cinema;
import com.movieTicket.MovieTicketBooking.service.CinemaService;

@RestController
public class CinemaController {

	
	@Autowired
    private CinemaService service;

    @PostMapping("/addCinema")
    public Cinema addCinema(@RequestBody CinemaRequest cinemaRequest) {
        return service.saveCinema(cinemaRequest);
    }

    @PostMapping("/addCinemas")
    public List<Cinema> addCinemas(@RequestBody List<Cinema> Cinemas) {
        return service.saveCinemas(Cinemas);
    }

    @GetMapping("/cinemas")
    public List<Cinema> findAllCinemas() {
        return service.getCinemas();
    }

    @GetMapping("/cinemaById/{id}")
    public Cinema findCinemaById(@PathVariable int id) {
        return service.getCinemaById(id);
    }

    @GetMapping("/cinema/{name}")
    public Cinema findCinemaByName(@PathVariable String name) {
        return service.getCinemaByName(name);
    }

    @PutMapping("/cinema/update")
    public Cinema updateCinema(@RequestBody CinemaRequest cinemaRequest) {
        return service.updateCinema(cinemaRequest);
    }

    @DeleteMapping("/cinema/delete/{id}")
    public String deleteCinema(@PathVariable int id) {
        return service.deleteCinema(id);
    }
}
