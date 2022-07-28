
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

import com.movieTicket.MovieTicketBooking.entity.Movie;
import com.movieTicket.MovieTicketBooking.service.MovieService;

@RestController
public class MovieController {

	
	@Autowired
    private MovieService service;

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return service.saveMovie(movie);
    }

    @PostMapping("/addMovies")
    public List<Movie> addMovies(@RequestBody List<Movie> movies) {
        return service.saveMovies(movies);
    }

    @GetMapping("/Movies")
    public List<Movie> findAllMovies() {
        return service.getMovies();
    }

    @GetMapping("/MovieById/{id}")
    public Movie findMovieById(@PathVariable int id) {
        return service.getMovieById(id);
    }

    @GetMapping("/Movie/{title}")
    public Movie findMovieByTitle(@PathVariable String title) {
        return service.getMovieByTitle(title);
    }

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie Movie) {
        return service.updateMovie(Movie);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
        return service.deleteMovie(id);
    }
}
