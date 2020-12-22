package com.bridgelabz.addressbookapp.model;

import lombok.Data;

@Data
public class ResponseDTO {
	
	String message;
	Object data;
	public ResponseDTO(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
}
