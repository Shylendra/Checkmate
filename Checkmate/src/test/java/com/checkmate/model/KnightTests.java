package com.checkmate.model;

import org.junit.Before;
import org.junit.Test;

import com.checkmate.game.Game;
import com.checkmate.util.CheckmateUtil;

public class KnightTests {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testKnight_valid1() throws Exception {
		Game game = new Game();
		System.out.println(">>> testKnight_valid1(): ");
		System.out.println("InitializeBoardGivenPlayers: " + game.initializeBoardGivenPlayers());
		
		Piece knight = new Knight(true, "B", 1);
		System.out.println("Initialized Position(x,y): (" + knight.getX() + ", " + knight.getY() +") : " + "B1");
		
		game.getBoard().movePiece(knight, 1);
		System.out.println("After Movement Position(x,y): (" + knight.getX() + ", " + knight.getY() +") : " + CheckmateUtil.getIndex(knight.getX()) + knight.getY());
		System.out.println("\n");
		
	}

}
