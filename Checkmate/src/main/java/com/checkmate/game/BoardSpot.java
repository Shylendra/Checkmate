package com.checkmate.game;

import com.checkmate.model.Piece;

public class BoardSpot {
	
    int x;
    int y;
    Piece piece;
    
	public BoardSpot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		piece = null;
	}
    
    public void occupySpot(Piece piece){
        if(this.piece != null)
            this.piece.setAvailable(false);
        this.piece = piece;
    }

    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    public Piece releaseSpot() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }
    
}
