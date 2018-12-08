package com.checkmate.game;

import java.util.ArrayList;
import java.util.List;

import com.checkmate.model.Piece;

public class Player {
	
	private boolean white;
	private List<Piece> pieces;
	
	public Player(boolean white) {
		super();
		this.white = white;
	}

	public List<Piece> getPieces() {
		if(this.pieces == null) {
			this.pieces = new ArrayList<>();
		}
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}
	
}
