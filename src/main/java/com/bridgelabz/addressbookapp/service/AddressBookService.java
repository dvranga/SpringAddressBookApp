package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;
	
	private List<AddressBookData> addressBookList=new ArrayList<AddressBookData>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookById(int contId) {
		return addressBookList.stream()
								.filter(contact -> contact.getAddressBookId()==contId)
								.findFirst()
								.orElseThrow(() -> new AddressBookException("Contact not present "));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = new AddressBookData(addressBookDTO);
		addressBookList.add( addressBookData);
		log.debug("Address book data ", addressBookData);
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public AddressBookData updateAddressBookData(int contId, AddressBookDTO addressBookDTO) {
		AddressBookData contact = addressBookList.get(contId-1);
		contact.setName(addressBookDTO.getName());
		contact.setAddress(addressBookDTO.getAddress());
		addressBookList.set(contId-1, contact);
		return contact;
	}

	@Override
	public void deleteAddressBookData(int contId) {
		addressBookList.remove(contId-1);
	}

}











