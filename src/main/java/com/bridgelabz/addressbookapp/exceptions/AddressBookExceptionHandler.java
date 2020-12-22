package com.bridgelabz.addressbookapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bridgelabz.addressbookapp.model.ResponseDTO;

@ControllerAdvice
public class AddressBookExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<ResponseDTO> methodNotFindMethodExceptionHandler(MethodArgumentNotValidException exception){
		List<ObjectError> allErrors = exception.getBindingResult().getAllErrors();
		List<String> collect = allErrors.stream().map(mapper -> mapper.getDefaultMessage()).collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST request ", collect);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AddressBookException.class)
	ResponseEntity<ResponseDTO> addressBookException(AddressBookException exception){
		ResponseDTO responseDTO=new ResponseDTO("Exception while processing REST request ", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
	}
}
