package com.aires.exceptionhandlers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.aires.exceptions.InvalidRequestException;

@ControllerAdvice
public class AiresExceptionHandler extends ResponseEntityExceptionHandler {
	
	 @ExceptionHandler({ InvalidRequestException.class })
	    protected ResponseEntity<Object> handleInvalidRequest(RuntimeException e, WebRequest request) {
	        InvalidRequestException ire = (InvalidRequestException) e;
	        
	        ErrorResource error = new ErrorResource("Invalid Parameters/Fields", "Parameters or Fields are not matching.");
	        
	        HttpHeaders headers = new HttpHeaders();
	        //headers.setContentType(MediaType.APPLICATION_JSON);
	        
	        return handleExceptionInternal(ire, error, headers, HttpStatus.UNPROCESSABLE_ENTITY, request);
	 }

}
