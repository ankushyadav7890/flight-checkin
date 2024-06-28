package com.ankush.flightcheckin.integration;
import com.ankush.flightcheckin.integration.dto.Reservation;
import com.ankush.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
