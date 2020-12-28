package com.bridgelabz.addressbookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
@Table
public class AddressBookData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressbook_id")
	public int addressBookId;
	
	public String name;
	public String address;
	public String phoneNumber;
	public String city;
	public String state;
	public String zip;
	
	public AddressBookData( AddressBookDTO addressBookDTO) {
		 this.updateAddressBookData(addressBookDTO);

	}

	private void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name=addressBookDTO.getName();
		this.address=addressBookDTO.getAddress();
		this.phoneNumber=addressBookDTO.getPhoneNumber();
		this.city=addressBookDTO.getCity();
		this.state=addressBookDTO.getState();
	}
	
}
