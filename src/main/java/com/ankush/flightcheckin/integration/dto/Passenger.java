package com.ankush.flightcheckin.integration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Passenger{

	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;

}
