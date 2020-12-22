package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

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
		List<AddressBookData> addressBookData = this.getAddressBookData();
		addressBookList.add( new AddressBookData(addressBookData.size()+1, addressBookDTO));
		return addressBookList.get(addressBookList.size()-1);
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











