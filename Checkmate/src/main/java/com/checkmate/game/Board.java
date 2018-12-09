package com.checkmate.game;

import com.checkmate.exceptions.IllegalMovementException;
import com.checkmate.model.Bishop;
import com.checkmate.model.Knight;
import com.checkmate.model.Piece;
import com.checkmate.model.Queen;
import com.checkmate.util.CheckmateUtil;

public class Board {
	public BoardSpot[][] boardSpots = new BoardSpot[8][8];
	
    public Board() {
        super();
        for(int i=0; i<boardSpots.length; i++){
            for(int j=0; j<boardSpots.length; j++){
                this.boardSpots[i][j] = new BoardSpot(i, j);
            }
        }
    }

    public BoardSpot getBoardSpot(int x, int y) {
        return boardSpots[x][y];
    }

    public void movePiece(Piece piece, int steps) throws IllegalMovementException {
    	
    	int newX = piece.getX();
    	int newY = piece.getY();
    	if(piece instanceof Bishop) {
    		newX = newX + steps;
    		newY = newY + steps;
    	} else if(piece instanceof Queen) {
    		newY = newY + steps;
    	} else if(piece instanceof Knight) {
    		newX = newX + 1;
    		newY = newY + steps + 1;
    	}
    	
    	if(piece.isValid(this, piece.getX(), piece.getY(), newX, newY)) {
    		piece.setAvailable(piece.isAvailable());
    		piece.setX(newX);
    		piece.setY(newY);
    	} else {
    		throw new IllegalMovementException(CheckmateUtil.INVALID_MOVEMENT_ERROR_MSG);
    	}
    	
    }

}
