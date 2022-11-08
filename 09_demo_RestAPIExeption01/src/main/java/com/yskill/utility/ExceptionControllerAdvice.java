package com.yskill.utility;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yskill.exception.EmployeeException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	@Autowired
	private Environment env;
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ErrorInfo> employeeExceptionHandler(EmployeeException e)
	{
		ErrorInfo err=new ErrorInfo();
		err.setErrorMessage(env.getProperty(e.getMessage()));
		err.setErrorCode(HttpStatus.NOT_FOUND.value());
		err.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(err,
				HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception e)
	{
		ErrorInfo err=new ErrorInfo();
		err.setErrorMessage(env.getProperty(e.getMessage()));
		err.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		err.setTimestamp(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo> (err,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
