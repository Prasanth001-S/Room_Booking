package com.project.room_bookin.beans;

public class AvailableRoomsDetails {
	
	private Long id;
	
	private String roomName;
	
	private Long roomPrice;
	
	/*
	 * private boolean bookingStatus;
	 * 
	 * private ReservationDetails reservationDetail;
	 * 
	 * public ReservationDetails getReservationDetail() { return reservationDetail;
	 * }
	 * 
	 * 
	 * public void setReservationDetail(ReservationDetails reservationDetail) {
	 * this.reservationDetail = reservationDetail; }
	 */


	public AvailableRoomsDetails()
	{
		
	}


	public AvailableRoomsDetails(Long id, String roomName, Long roomPrice /* boolean bookingStatus ReservationDetails reservationDetail */) {
		super();
		this.id = id;
		this.roomName = roomName;
		this.roomPrice = roomPrice;
		//this.bookingStatus = bookingStatus;
	//	this.reservationDetail = reservationDetail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	public Long getRoomPrice() {
		return roomPrice;
	}


	public void setRoomPrice(Long roomPrice) {
		this.roomPrice = roomPrice;
	}


	/*
	 * public boolean getBookingStatus() { return bookingStatus; }
	 * 
	 * 
	 * public void setBookingStatus(boolean bookingStatus) { this.bookingStatus =
	 * bookingStatus; }
	 */


	@Override
	public String toString() {
		return "AvailableRoomsDetails [id=" + id + ", roomName=" + roomName + ", roomPrice=" + roomPrice + "]";
	}
	
	
	

}
