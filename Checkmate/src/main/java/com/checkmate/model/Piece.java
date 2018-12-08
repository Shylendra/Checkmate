package com.checkmate.model;

import com.checkmate.game.Board;

public abstract class Piece {
	
    public int x, y;
    public boolean available;
    
	public Piece(boolean available, int x, int y) {
		super();
		this.available = available;
		this.x = x;
		this.y = y;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY){
        if(toX == fromX && toY == fromY)
            return false;
        if(toX < 1 || toX > 8 || fromX < 1 || fromX > 8 || toY < 1 || toY > 8 || fromY < 1 || fromY > 8)
            return false;
        return true;
    }	
    
}
