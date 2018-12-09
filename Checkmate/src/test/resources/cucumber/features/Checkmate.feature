Feature: Every piece in chess moves differently as defined in the rules which are defined in the problem statement.

  Scenario Outline: A "<Piece>" moves differently on a Chess board as defined in the problem statement
    Given A Chess board and a "<Piece>" at "<Current position on board>"
    When I move the piece to "<Steps>" steps ahead
    Then The output should be same as "<Output>"
    
    Examples:
  		| Piece       | Current position on board | Steps           | Output            |
   		| Queen       | D1                        | 3               | D4                |
   		| Queen       | D4                        | 100             | Illegal movement! |
   		| Knight      | B1                        | 1               | C3                |
   		| Bishop      | C4                        | 4               | G8                |
	    