package com.devsuperior.bds04.services.exceptions;

public class DatabaseNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DatabaseNotFoundException(String msg) {
		super(msg);
	}

}
