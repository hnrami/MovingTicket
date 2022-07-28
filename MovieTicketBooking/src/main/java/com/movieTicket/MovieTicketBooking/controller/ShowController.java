
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

import com.movieTicket.MovieTicketBooking.Request.ShowRequest;
import com.movieTicket.MovieTicketBooking.entity.Show;
import com.movieTicket.MovieTicketBooking.service.ShowService;

@RestController
public class ShowController {

	
	@Autowired
    private ShowService service;

    @PostMapping("/addShow")
    public Show addShow(@RequestBody ShowRequest showRequest) {
        return service.saveShow(showRequest);
    }

    @PostMapping("/addShows")
    public List<Show> addShows(@RequestBody List<Show> Shows) {
        return service.saveShows(Shows);
    }

    @GetMapping("/shows")
    public List<Show> findAllShows() {
        return service.getShows();
    }

    @GetMapping("/showById/{id}")
    public Show findShowById(@PathVariable int id) {
        return service.getShowById(id);
    }

  
    @PutMapping("/show/update")
    public Show updateShow(@RequestBody ShowRequest showRequest) {
        return service.updateShow(showRequest);
    }

    @DeleteMapping("/show/delete/{id}")
    public String deleteShow(@PathVariable int id) {
        return service.deleteShow(id);
    }
}
