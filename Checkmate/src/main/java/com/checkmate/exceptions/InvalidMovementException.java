package com.checkmate.exceptions;

import com.checkmate.util.CheckmateUtil;

public class InvalidMovementException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidMovementException(){
        System.out.println(CheckmateUtil.INVALID_MOVEMENT_ERROR_MSG);
    }
	
}
