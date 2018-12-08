package stepdeffs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CheckmateSteps {

	@Given("^A Chess board and the Queen piece at location D(\\d+)$")
	public void a_Chess_board_and_the_Queen_piece_at_location_D(int arg1) throws Throwable {
	    System.out.println(">>> A Chess board and the Queen piece at location: " + arg1);
	}

	@Given("^The number of steps expected to move is (\\d+)$")
	public void the_number_of_steps_expected_to_move_is(int arg1) throws Throwable {
	    System.out.println(">>> The number of steps expected to move is: " + arg1);
	}

	@Then("^Move the piece$")
	public void move_the_piece() throws Throwable {
	    System.out.println(">>> Move the piece: " );
	}

	@Then("^Verify the new position equals to D(\\d+)$")
	public void verify_the_new_position_equals_to_D(int arg1) throws Throwable {
	    System.out.println(">>> Verify the new position equals to D: " + arg1);
	}
	
}
