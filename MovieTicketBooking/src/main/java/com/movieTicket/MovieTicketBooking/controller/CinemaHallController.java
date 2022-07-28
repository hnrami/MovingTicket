
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

import com.movieTicket.MovieTicketBooking.Request.CinemaHallRequest;
import com.movieTicket.MovieTicketBooking.entity.CinemaHall;
import com.movieTicket.MovieTicketBooking.service.CinemaHallService;

@RestController
public class CinemaHallController {

	
	@Autowired
    private CinemaHallService service;

    @PostMapping("/addCinemaHall")
    public CinemaHall addCinemaHall(@RequestBody CinemaHallRequest cinemaHallRequest) {
        return service.saveCinemaHall(cinemaHallRequest);
    }

    @PostMapping("/addCinemaHalls")
    public List<CinemaHall> addCinemaHalls(@RequestBody List<CinemaHall> cinemaHalls) {
        return service.saveCinemaHalls(cinemaHalls);
    }

    @GetMapping("/cinemaHalls")
    public List<CinemaHall> findAllCinemaHalls() {
        return service.getCinemaHalls();
    }

    @GetMapping("/cinemaHallById/{id}")
    public CinemaHall findCinemaHallById(@PathVariable int id) {
        return service.getCinemaHallById(id);
    }

    @GetMapping("/cinemaHall/{title}")
    public CinemaHall findCinemaHallByName(@PathVariable String name) {
        return service.getCinemaHallByName(name);
    }

    @PutMapping("/cinemaHall/update")
    public CinemaHall updateCinemaHall(@RequestBody CinemaHallRequest cinemaHallRequest) {
        return service.updateCinemaHall(cinemaHallRequest);
    }

    @DeleteMapping("/cinemaHall/delete/{id}")
    public String deleteCinemaHall(@PathVariable int id) {
        return service.deleteCinemaHall(id);
    }
}
