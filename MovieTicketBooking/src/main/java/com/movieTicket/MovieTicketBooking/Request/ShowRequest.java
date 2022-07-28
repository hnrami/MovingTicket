package com.movieTicket.MovieTicketBooking.Request;

public class ShowRequest {
	
	int showId;
	String date;
	String startTime;
	String emdTime;
	int cinemaHallId;
	int movieId;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEmdTime() {
		return emdTime;
	}
	public void setEmdTime(String emdTime) {
		this.emdTime = emdTime;
	}
	public int getCinemaHallId() {
		return cinemaHallId;
	}
	public void setCinemaHallId(int cinemaHallId) {
		this.cinemaHallId = cinemaHallId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	

}
