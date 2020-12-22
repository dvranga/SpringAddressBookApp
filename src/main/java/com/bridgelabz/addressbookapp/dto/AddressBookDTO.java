package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Address book is Invalid!!! ")
	@NotEmpty(message = "Address book name cannot be null")
	String name;
	
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Address is Invalid!!! ")
	@NotEmpty(message = "Address cannot be null")
	String address;

	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}	
}
