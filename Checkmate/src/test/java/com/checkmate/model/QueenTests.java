package com.checkmate.model;

import org.junit.Before;
import org.junit.Test;

import com.checkmate.exceptions.InvalidMovementException;
import com.checkmate.game.Game;
import com.checkmate.util.CheckmateUtil;

public class QueenTests {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testQueen_valid1() throws Exception {
		Game game = new Game();
		System.out.println(">>> testQueen_valid1(): ");
		System.out.println("InitializeBoardGivenPlayers: " + game.initializeBoardGivenPlayers());
		
		Piece queen = new Queen(true, "D", 1);
		System.out.println("Initialized Position(x,y): (" + queen.getX() + ", " + queen.getY() +") : " + "D1");
		
		game.getBoard().movePiece(queen, 3);
		System.out.println("After Movement Position(x,y): (" + queen.getX() + ", " + queen.getY() +") : " + CheckmateUtil.getIndex(queen.getX()) + queen.getY());
		System.out.println("\n");
		
	}

	@Test(expected = InvalidMovementException.class)
	public void testQueen_invalid1() throws Exception {
		Game game = new Game();
		System.out.println(">>> testQueen_invalid1(): ");
		System.out.println("InitializeBoardGivenPlayers: " + game.initializeBoardGivenPlayers());
		
		Piece queen = new Queen(true, "D", 4);
		System.out.println("Initialized Position(x,y): (" + queen.getX() + ", " + queen.getY() +") : " + "D4");
		
		game.getBoard().movePiece(queen, 100);
		System.out.println("After Movement Position(x,y): (" + queen.getX() + ", " + queen.getY() +") : " + CheckmateUtil.getIndex(queen.getX()) + queen.getY());
		System.out.println("\n");
		
	}
	
}
