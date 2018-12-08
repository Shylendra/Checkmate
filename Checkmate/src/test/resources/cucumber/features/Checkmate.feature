Feature: Every piece in chess moves differently as defined in the rules which are defined in the problem statement.

  Scenario: Queen moves vertically forward 1 place in each step
    Given A Chess board and the Queen piece at location D1
    And The number of steps expected to move is 3
    Then Move the piece
    Then Verify the new position equals to D4
