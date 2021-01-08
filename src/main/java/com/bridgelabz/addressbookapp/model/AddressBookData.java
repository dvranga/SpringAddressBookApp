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
@Table(name = "addressbook")
public class AddressBookData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int id;
	
	public String name;
	public String address;
	public String mobile;
	public String city;
	public String state;
	public String zip;
	
	public AddressBookData() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressBookData( AddressBookDTO addressBookDTO) {
		 this.updateAddressBookData(addressBookDTO);

	}

	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name=addressBookDTO.getName();
		this.address=addressBookDTO.getAddress();
		this.mobile=addressBookDTO.getMobile();
		this.city=addressBookDTO.getCity();
		this.state=addressBookDTO.getState();
		this.zip=addressBookDTO.getZip();
	}
	
}
