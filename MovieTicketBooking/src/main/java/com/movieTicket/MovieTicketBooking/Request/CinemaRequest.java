package com.movieTicket.MovieTicketBooking.Request;

public class CinemaRequest {
	
	
	int cinemaId;
	String name;
	String totalCinemaHalls;
	int cityId;
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTotalCinemaHalls() {
		return totalCinemaHalls;
	}
	public void setTotalCinemaHalls(String totalCinemaHalls) {
		this.totalCinemaHalls = totalCinemaHalls;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	

}
