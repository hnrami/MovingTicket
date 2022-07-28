package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieTicket.MovieTicketBooking.entity.City;

public interface CityRepository extends JpaRepository<City,Integer> {
	
	
	City findByName(String name);

	City findByCityId(int cityID);

}
