package com.project.room_bookin.beans;

public class ReservedRoomDetails {
	
	private Long roomId;
	private String checkInDate;
	private String checkOutDate;
	
	public ReservedRoomDetails()
	{
		
	}

	public ReservedRoomDetails(Long roomId, String checkInDate, String checkOutDate) {
		super();
		this.roomId = roomId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
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

	@Override
	public String toString() {
		return "ReservedRoomDetails [roomId=" + roomId + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + "]";
	}
	
	
	

}
