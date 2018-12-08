package com.checkmate.model;

import com.checkmate.game.Board;
import com.checkmate.util.CheckmateUtil;

public class Bishop extends Piece {
	
	
	public Bishop(boolean available, int x, int y) {
		super(available, x, y);
	}

	public Bishop(boolean available, String x, int y) {
		super(available, CheckmateUtil.getIndex(x), y);
	}
	
	@Override
	public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if(toX - fromX == toY - fromY)
            return true;

        return false;
	}

}
