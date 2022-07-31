package com.microservices.ims.inventoryservice.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MVCExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List> validationErrorHandler(MethodArgumentNotValidException e){
		
		
		  List<String> errorList = new ArrayList<>(e.getAllErrors().size());
		  
		  e.getAllErrors().forEach(error ->errorList.add(error.toString()));
		 
		return new ResponseEntity<>(errorList,HttpStatus.BAD_REQUEST);
	}

}
