package com.movieTicket.MovieTicketBooking.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CinemaSeat")
public class CinemaSeat {
	
	@Id
    @GeneratedValue
	int cinemaSeatId;
	int seatNumber;
	String type;
	
	
	@ManyToOne(fetch=FetchType.LAZY,optional =false)
	@JoinColumn(name="cinemaHall_id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore 
	private CinemaHall cinemaHall;


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


	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}


	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	
	
	
	

}
