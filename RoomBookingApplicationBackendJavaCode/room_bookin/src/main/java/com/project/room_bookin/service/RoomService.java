package com.project.room_bookin.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.room_bookin.beans.AvailableRoomsDetails;
import com.project.room_bookin.beans.ReservationDetails;
import com.project.room_bookin.beans.ReservedRoomDetails;
//import com.project.room_bookin.beans.RoomDetails;
import com.project.room_bookin.beans.SignUp;

@Service
public class RoomService {

	/*-----------------------------------------------Available Rooms Details------------------------------------------------------------------- */

	static ArrayList<AvailableRoomsDetails> availableRoomsDetails = new ArrayList<AvailableRoomsDetails>();
	private static Long index = 2L;

	static {
		AvailableRoomsDetails availableRoomsDetails1 = new AvailableRoomsDetails(1l, "Sans", 30000l);
		AvailableRoomsDetails availableRoomsDetails2 = new AvailableRoomsDetails(2l, "Poppins", 40000l);
		availableRoomsDetails.add(availableRoomsDetails1);// put(1l, singUp1);
		availableRoomsDetails.add(availableRoomsDetails2);
	}

	//
	public List<AvailableRoomsDetails> getAllAvailableRoomsDetailsRooms() {
		return availableRoomsDetails;
	}

	// get By Id
	public AvailableRoomsDetails getAvailableRoomsDetailsById(Long id) {
		for (AvailableRoomsDetails avail : availableRoomsDetails) {
			if (avail.getId() == id) {
				return avail;
			}
		}

		return null;
	}

	public AvailableRoomsDetails addAvailableRoomsDetails(AvailableRoomsDetails availableRoomsDetail) {
		index = index + 1;

		AvailableRoomsDetails rooms = new AvailableRoomsDetails();

		rooms.setId(index);
		rooms.setRoomName(availableRoomsDetail.getRoomName());
		rooms.setRoomPrice(availableRoomsDetail.getRoomPrice());

		availableRoomsDetails.add(rooms);

		return rooms;
	}

	public static void availableRoomsDetails() {
		System.out.println(index);
	}

	/*-----------------------------------------------Reservation Details------------------------------------------------------------------- */

	static ArrayList<ReservationDetails> reservationDetails = new ArrayList<ReservationDetails>();
	private static Long inde = 1l;

	static {

		ReservationDetails reservationDetails1 = new ReservationDetails(1l, "07/04/2023", "10/04/2023", 1l, 1l, 1l);
		reservationDetails.add(reservationDetails1);

	}

	// get method
	public List<ReservationDetails> getAllReservationDetails() {
		return reservationDetails;
	}

	// Get By Id
	public ReservationDetails getReservationDetailsById(Long id) {
		for (ReservationDetails reseve : reservationDetails) {
			if (reseve.getId() == id) {
				return reseve;
			}
		}

		return null;
	}

	// Post method
	public ReservationDetails addReservationDetails(ReservationDetails reservationDetail) {
		inde = inde + 1;

		ReservationDetails rd = new ReservationDetails();

		rd.setId(inde);
		rd.setCheckInDate(reservationDetail.getCheckInDate());
		rd.setCheckOutDate(reservationDetail.getCheckOutDate());
		rd.setAdult(reservationDetail.getAdult());
		rd.setChildrens(reservationDetail.getChildrens());
		rd.setRoom(reservationDetail.getRoom());

		// ((Collection<AvailableRoomsDetails>) reservationDetails).add(rd);

		reservationDetails.add(rd);

		roomBooking(reservationDetail);
		roomReducing(reservationDetail);

		return rd;

	}

	// After booking available room count should be reduced
	public void roomReducing(ReservationDetails reservationDetail) {
		AvailableRoomsDetails roomDetailsForfClients = new AvailableRoomsDetails();

		for (AvailableRoomsDetails avl : availableRoomsDetails) {
			if (avl.getId() == reservationDetail.getId()) {
				// roomDetailsForfClients.//add(avl);
				availableRoomsDetails.remove(reservationDetail.getId());
			}
		}

	}

	/*-------------------------------------------------------Reserved Rooms Details---------------------------------------------------------------------------------- */

	static ArrayList<ReservedRoomDetails> reservedRoomDetails = new ArrayList<ReservedRoomDetails>();

	static {
		ReservedRoomDetails reservedRoomDetails1 = new ReservedRoomDetails(1l, "07/04/2023", "10/04/2023");
		reservedRoomDetails.add(reservedRoomDetails1);
	}

	public void roomBooking(ReservationDetails reservationDetail) {
		ReservedRoomDetails reservation = new ReservedRoomDetails();

		reservation.setRoomId(reservationDetail.getId());
		reservation.setCheckInDate(reservationDetail.getCheckInDate());
		reservation.setCheckOutDate(reservationDetail.getCheckOutDate());

		reservedRoomDetails.add(reservation);

		// return "your room booking process is completed";
	}

// get all reserved rooms details
	public List<ReservedRoomDetails> getAllReservedRoomsDetails() {
		return reservedRoomDetails;
	}

	/*
	 * -----------------------------------------------------------------------------
	 * -----------------------------
	 */
}
