package com.movieTicket.MovieTicketBooking.Request;

public class CinemaSeatRequest {

	
	int cinemaSeatId;
	int seatNumber;
	String type;
	int cinemahallId;
	public int getCinemaSeatId() {
		return cinemaSeatId;
	}
	public void setCinemaSeatId(int cinemaSeatId) {
		this.cinemaSeatId = cinemaSeatId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCinemahallId() {
		return cinemahallId;
	}
	public void setCinemahallId(int cinemahallId) {
		this.cinemahallId = cinemahallId;
	}
	
	
}
