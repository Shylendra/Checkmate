package com.checkmate.model;

import com.checkmate.game.Board;
import com.checkmate.util.CheckmateUtil;

public class Queen extends Piece {

	public Queen(boolean available, int x, int y) {
		super(available, x, y);
	}

	public Queen(boolean available, String x, int y) {
		super(available, CheckmateUtil.getIndex(x), y);
	}

	@Override
	public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        //Diagonal
        if(toX - fromX == toY - fromY)
            return true;
        if(toX == fromX)
            return true;
        if(toY == fromY)
            return true;

        return false;
	}

	
}
