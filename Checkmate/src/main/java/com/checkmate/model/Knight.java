package com.checkmate.model;

import com.checkmate.game.Board;
import com.checkmate.util.CheckmateUtil;

public class Knight extends Piece {

	public Knight(boolean available, int x, int y) {
		super(available, x, y);
	}

	public Knight(boolean available, String x, int y) {
		super(available, CheckmateUtil.getIndex(x), y);
	}

	@Override
	public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
		
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
            return false;
        if(toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
            return false;

        return true;
	}

	
}
