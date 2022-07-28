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
@Table(name = "Cinema")
public class Cinema {

	@Id
    @GeneratedValue
	int cinemaId;
	String name;
	String totalCinemaHalls;
	
	@ManyToOne(fetch=FetchType.LAZY,optional =false)
	@JoinColumn(name="city_id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private City city;

	

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getTotalCinemaHalls() {
		return totalCinemaHalls;
	}

	public void setTotalCinemaHalls(String totalCinemaHalls) {
		this.totalCinemaHalls = totalCinemaHalls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
