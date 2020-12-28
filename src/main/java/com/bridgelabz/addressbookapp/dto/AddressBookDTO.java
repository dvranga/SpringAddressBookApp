package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Name is Invalid!!! ")
	@NotEmpty(message = "Address book name cannot be null")
	String name;
	
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Address is Invalid!!! ")
	@NotEmpty(message = "Address cannot be null")
	String address;

	@Pattern(regexp ="^[9][1][ ][6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	@NotEmpty(message = "PhoneNo cannot be null")
	public String phoneNumber;
	
	String city;
	
	String state;
	
	String zip;
	
	
	
	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}	
}
