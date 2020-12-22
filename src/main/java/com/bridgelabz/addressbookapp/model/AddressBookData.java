package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Data
public class AddressBookData {
	public int addressBookId;
	public String name;
	public String address;
	
	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		this.addressBookId=addressBookId;
		this.name=addressBookDTO.getName();
		this.address=addressBookDTO.getAddress();
	}
	
}
