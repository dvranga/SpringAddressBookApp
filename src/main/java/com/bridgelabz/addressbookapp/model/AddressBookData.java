package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Data
public class AddressBookData {
	public int addressBookId;
	public String name;
	public String address;
	public String phoneNumber;
	public String city;
	public String state;
	public String zip;
	
	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		this.addressBookId=addressBookId;
		this.name=addressBookDTO.getName();
		this.address=addressBookDTO.getAddress();
		this.phoneNumber=addressBookDTO.getPhoneNumber();
		this.city=addressBookDTO.getCity();
		this.state=addressBookDTO.getState();
	}
	
}
