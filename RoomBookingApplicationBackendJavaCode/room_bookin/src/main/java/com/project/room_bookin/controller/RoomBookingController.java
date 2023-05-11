package com.project.room_bookin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.room_bookin.beans.AvailableRoomsDetails;
import com.project.room_bookin.beans.ReservationDetails;
import com.project.room_bookin.beans.ReservedRoomDetails;
import com.project.room_bookin.service.RoomService;

@RestController
public class RoomBookingController {

	@Autowired(required = true)
	private RoomService roomService;

	/*-----------------------------------------------Available Rooms Details------------------------------------------------------------------- */

	@GetMapping(path = "/getAllAvailableRoomsDetailsRooms")
	public ResponseEntity<List<AvailableRoomsDetails>> getAllAvailableRoomsDetailsRooms() {
		return new ResponseEntity<List<AvailableRoomsDetails>>(roomService.getAllAvailableRoomsDetailsRooms(),
				HttpStatus.OK);
	}

	@GetMapping(path = "/getAvailableRoomsDetailsById/{id}")
	public ResponseEntity<AvailableRoomsDetails> getAvailableRoomsDetailsById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<AvailableRoomsDetails>(roomService.getAvailableRoomsDetailsById(id),
				HttpStatus.ACCEPTED);
	}

	@PostMapping(path = "/addAvailableRoomsDetails")
	public ResponseEntity<AvailableRoomsDetails> addAvailableRoomsDetails(@RequestBody AvailableRoomsDetails availableRoomsDetails) {
		return new ResponseEntity<AvailableRoomsDetails>(roomService.addAvailableRoomsDetails(availableRoomsDetails),
				HttpStatus.ACCEPTED);
	}

	/*-------------------------------------------------------Reservation Details---------------------------------------------------------------------------------- */

	@GetMapping(path = "/getAllReservationDetails")
	public ResponseEntity<List<ReservationDetails>> getAllReservationDetails() {
		return new ResponseEntity<List<ReservationDetails>>(roomService.getAllReservationDetails(), HttpStatus.OK);

	}

	@GetMapping(path = "/getReservationDetailsById/{id}")
	public ResponseEntity<ReservationDetails> getReservationDetailsById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<ReservationDetails>(roomService.getReservationDetailsById(id), HttpStatus.ACCEPTED);
	}

	@PostMapping(path = "/addReservationDetails")
	public ResponseEntity<ReservationDetails> addReservationDetails(@RequestBody ReservationDetails reservationDetail) {
		return new ResponseEntity<ReservationDetails>(roomService.addReservationDetails(reservationDetail),
				HttpStatus.ACCEPTED);
	}

	/*-------------------------------------------------------Reserved Rooms Details---------------------------------------------------------------------------------- */

	@GetMapping(path = "/getAllReservedRoomsDetails")
	public ResponseEntity<List<ReservedRoomDetails>> getAllReservedRoomsDetails() {
		return new ResponseEntity<List<ReservedRoomDetails>>(roomService.getAllReservedRoomsDetails(), HttpStatus.OK);
	}

}
