package stepdeffs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.checkmate.game.Game;
import com.checkmate.model.Bishop;
import com.checkmate.model.Knight;
import com.checkmate.model.Piece;
import com.checkmate.model.Queen;
import com.checkmate.util.CheckmateUtil;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.util.Pair;

public class CheckmateSteps {
	
	private Game game;
	private Piece pieceObj;
	private String actualOutput;

	@Before
	public void initialize() throws IOException {
		game = new Game();
		assertTrue(game.initializeBoardGivenPlayers());
	}
	
	@Given("^A Chess board and a \"([^\"]*)\" at \"([^\"]*)\"$")
	public void a_Chess_board_and_a_at(String piece, String currentPosition) throws Throwable {
		String step = "GIVEN: A Chess board and a " + piece + " at " + currentPosition;
	    System.out.println(step);
	    
	    Pair<String, Integer> cpPair = CheckmateUtil.getPositionPair(currentPosition);
	    if(piece.equals(CheckmateUtil.QUEEN_TXT)) {
	    	pieceObj = new Queen(true, cpPair.getKey(), cpPair.getValue());
	    } else if(piece.equals(CheckmateUtil.KNIGHT_TXT)) {
	    	pieceObj = new Knight(true, cpPair.getKey(), cpPair.getValue());
	    } else if(piece.equals(CheckmateUtil.BISHOP_TXT)) {
	    	pieceObj = new Bishop(true, cpPair.getKey(), cpPair.getValue());
	    }
	    
	}

	@When("^I move the piece to \"([^\"]*)\" steps ahead$")
	public void i_move_the_piece_to_steps_ahead(String stepsToMove) throws Throwable {
		String step = "WHEN: I move the piece to " + stepsToMove + " steps ahead";
	    System.out.println(step);
	    
	    try {
			game.getBoard().movePiece(pieceObj, Integer.parseInt(stepsToMove));
		    String xAxis = CheckmateUtil.getIndex(pieceObj.getX());
		    Integer yAxis = pieceObj.getY();
		    actualOutput = xAxis+yAxis;
	    } catch(Exception e) {
	    	actualOutput = e.getMessage();
	    	System.out.println(">>> e: " + e.getMessage());
	    }

	}

	@Then("^The output should be same as \"([^\"]*)\"$")
	public void the_output_should_be_same_as(String output) throws Throwable {
		String step = "THEN: The output should be same as " + output;
	    System.out.println(step);
	    
	    assertEquals(output, actualOutput);
	    
	}
	
}
