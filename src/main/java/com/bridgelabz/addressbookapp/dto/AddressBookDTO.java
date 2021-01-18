package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressBookDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Name is Invalid!!! ")
	@NotEmpty(message = "Address book name cannot be null")
	String name;
	
	
	@NotEmpty(message = "Address cannot be null")
	String address;

	@Pattern(regexp ="^[6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	@NotEmpty(message = "Mobile number cannot be null")
	public String mobile;
	
	@NotEmpty(message = "City cannot be null ")
	String city;
	
	@NotNull(message = "State cannot be null ")
	String state;
	
	@NotNull(message = "Zip cannot be null ")
	String zip;

}
//
//
//spring.profiles.active=dev
//
//environment=COMMON
//spring.jpa.hibernate.ddl-auto=update
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//spring.datasource.url=jdbc:mysql://springboot-angular-demo1.csnyo86d6okb.us-east-2.rds.amazonaws.com:3306/addressbook_db?allowPublicKeyRetrieval=true&useSSL=false
//spring.datasource.username=root
//spring.datasource.password=Reset1998