package com.checkmate.exceptions;

import com.checkmate.util.CheckmateUtil;

public class IllegalMovementException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public IllegalMovementException(String errorMessage){
		super(errorMessage);
    }
	
}
