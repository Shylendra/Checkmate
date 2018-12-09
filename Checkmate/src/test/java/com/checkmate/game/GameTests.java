package com.checkmate.game;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GameTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGame() {
		Game game = new Game();
		
		assertNotNull(game);
		assertNotNull(game.getWhite());
		assertNull(game.getBlack());
		assertTrue(game.initializeBoardGivenPlayers());
		assertNotNull(game.getBoard());
	}

}
