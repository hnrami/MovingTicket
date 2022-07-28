package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.entity.Movie;
import com.movieTicket.MovieTicketBooking.repository.MovieRepository;

@Service
public class MovieService {
	
	
	  @Autowired
	    private MovieRepository repository;

	    public Movie saveMovie(Movie movie) {
	        return repository.save(movie);
	    }

	    public List<Movie> saveMovies(List<Movie> movies) {
	        return repository.saveAll(movies);
	    }

	    public List<Movie> getMovies() {
	        return repository.findAll();
	    }

	    public Movie getMovieById(int id) {
	        return repository.findByMovieId(id);
	    }

	    public Movie getMovieByTitle(String title) {
	        return repository.findByTitle(title);
	    }

	    public String deleteMovie(int id) {
	        repository.deleteById(id);
	        return "Movie removed !! " + id;
	    }

	    public Movie updateMovie(Movie movie) {
	        Movie movieDetails = repository.findByMovieId(movie.getMovieId());
	        movieDetails.setCountry(movie.getCountry());
	        movieDetails.setDescription(movie.getDescription());
	        movieDetails.setDuration(movie.getDuration());
	        movieDetails.setLanguage(movie.getLanguage());
	        movieDetails.setReleaseDate(movie.getReleaseDate());
	        movieDetails.setTitle(movie.getTitle());
	        return repository.save(movieDetails);
	    }


}
