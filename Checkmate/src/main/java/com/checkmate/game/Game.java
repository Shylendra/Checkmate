package com.checkmate.game;

public class Game {
	
    private Board board;
    private Player white;
    private Player black;
    
	public Game() {
		super();
		this.white = new Player(true);
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		if(this.board == null) {
			this.board = new Board();
		}
		this.board = board;
	}

	public Player getWhite() {
		return white;
	}

	public void setWhite(Player white) {
		this.white = white;
	}

	public Player getBlack() {
		return black;
	}

	public void setBlack(Player black) {
		this.black = black;
	}
    
    public boolean initializeBoardGivenPlayers() {
    		
        if(this.white == null)
            return false;
        this.board = new Board();
        for(int i=0; i<white.getPieces().size(); i++){
            board.getBoardSpot(white.getPieces().get(i).getX(), white.getPieces().get(i).getY()).occupySpot(white.getPieces().get(i));
        }
        return true;
    }
    
}
