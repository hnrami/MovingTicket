package com.movieTicket.MovieTicketBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieTicket.MovieTicketBooking.entity.User;
import com.movieTicket.MovieTicketBooking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> saveUsers(List<User> users) {
		return repository.saveAll(users);
	}

	public List<User> getUsers() {
		return repository.findAll();
	}

	public User getUserById(int id) {
		return repository.findByUserId(id);
	}

	public User getUserByName(String name) {
		return repository.findByName(name);
	}

	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User removed !! " + id;
	}

	public User updateUser(User user) {
		User userDetails = repository.findByUserId(user.getUserId());
		userDetails.setEmail(user.getEmail());
		userDetails.setName(user.getName());
		userDetails.setPassword(user.getPassword());
		userDetails.setPhone(user.getPhone());

		return repository.save(userDetails);
	}

}
