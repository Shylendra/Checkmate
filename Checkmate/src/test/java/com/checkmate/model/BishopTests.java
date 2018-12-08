package com.checkmate.model;

import org.junit.Before;
import org.junit.Test;

import com.checkmate.exceptions.InvalidMovementException;
import com.checkmate.game.Game;
import com.checkmate.util.CheckmateUtil;

public class BishopTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBishop_valid1() throws Exception {
		Game game = new Game();
		System.out.println(">>> testBishop_valid1(): ");
		System.out.println("InitializeBoardGivenPlayers: " + game.initializeBoardGivenPlayers());
		
		Piece bishop = new Bishop(true, "C", 4);
		System.out.println("Initialized Position(x,y): (" + bishop.getX() + ", " + bishop.getY() +") : " + "C4");
		
		game.getBoard().movePiece(bishop, 4);
		System.out.println("After Movement Position(x,y): (" + bishop.getX() + ", " + bishop.getY() +") : " + CheckmateUtil.getIndex(bishop.getX()) + bishop.getY());
		System.out.println("\n");
	}
	
}
