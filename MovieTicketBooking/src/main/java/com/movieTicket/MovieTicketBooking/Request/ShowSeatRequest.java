package com.movieTicket.MovieTicketBooking.Request;

public class ShowSeatRequest {
	
	int showSeatId;
	int status;
	String price;
	int cinemaSeatId;
	int showId;
	int bookingId;
	public int getShowSeatId() {
		return showSeatId;
	}
	public void setShowSeatId(int showSeatId) {
		this.showSeatId = showSeatId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getCinemaSeatId() {
		return cinemaSeatId;
	}
	public void setCinemaSeatId(int cinemaSeatId) {
		this.cinemaSeatId = cinemaSeatId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	
	
}
