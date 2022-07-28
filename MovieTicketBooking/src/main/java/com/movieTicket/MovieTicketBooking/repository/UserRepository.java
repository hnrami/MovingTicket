package com.movieTicket.MovieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movieTicket.MovieTicketBooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	
	User findByName(String name);

	User findByUserId(int userId);

}
