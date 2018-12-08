package com.checkmate.exceptions;

import com.checkmate.util.CheckmateUtil;

public class InvalidInputException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidInputException(){
        System.out.println(CheckmateUtil.INVALID_INPUT_ERROR_MSG);
    }
	
}
