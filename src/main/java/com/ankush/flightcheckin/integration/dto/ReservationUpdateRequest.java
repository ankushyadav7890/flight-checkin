package com.ankush.flightcheckin.integration.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationUpdateRequest {

	private Long id;
	private Boolean checkedIn;
	private int numberOfBags;

}
