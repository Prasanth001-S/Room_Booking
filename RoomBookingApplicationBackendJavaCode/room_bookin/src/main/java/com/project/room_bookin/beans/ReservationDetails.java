package com.project.room_bookin.beans;

import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;

public class ReservationDetails { // Reservation form details

	private Long id;

	private String checkInDate;

	private String checkOutDate;

	private Long adult;

	private Long childrens;

	private Long Room;

	public ReservationDetails() {

	}

	public ReservationDetails(Long id, String checkInDate, String checkOutDate, Long adult, Long childrens, Long room) {
		super();
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.adult = adult;
		this.childrens = childrens;
		Room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Long getAdult() {
		return adult;
	}

	public void setAdult(Long adult) {
		this.adult = adult;
	}

	public Long getChildrens() {
		return childrens;
	}

	public void setChildrens(Long childrens) {
		this.childrens = childrens;
	}

	public Long getRoom() {
		return Room;
	}

	public void setRoom(Long room) {
		Room = room;
	}

	@Override
	public String toString() {
		return "RoomDetails [id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", adult="
				+ adult + ", childrens=" + childrens + ", Room=" + Room + "]";
	}

}
