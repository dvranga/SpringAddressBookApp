package com.bridgelabz.addressbookapp.dto;

import lombok.Data;

@Data
public class AddressBookDTO {
	
	String name;
	String address;

	public AddressBookDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}	
}
