package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.model.ResponseDTO;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookController {
	
	@RequestMapping(value={"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData addressBookData=null;
		addressBookData=new AddressBookData(1,(new AddressBookDTO("Ranganath", "gorantla")));
		ResponseDTO responseDTO=new ResponseDTO("Successfull got the data", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{contId}")
	public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable("contId") int contId){
		AddressBookData addressBookData=new AddressBookData(contId, new AddressBookDTO("Harinath", "Gorantla"));
		ResponseDTO responseDTO=new ResponseDTO("Successfully got the data ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=new AddressBookData(3, addressBookDTO);
		ResponseDTO responseDTO=new ResponseDTO("Successfully created the data ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{contId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contId") int contId,
												@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=new AddressBookData(contId, addressBookDTO);
		ResponseDTO responseDTO=new ResponseDTO("Updated address book of Id : ", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{contId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contId") int contId){
		ResponseDTO responseDTO=new ResponseDTO("Deleted successfully the contact ", contId);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
}
