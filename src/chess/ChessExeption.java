package chess;

import boardGame.BoardException;

public class ChessExeption extends BoardException{
	private static final long serialVersionUID = 1L;
	
	public ChessExeption(String msg) {
		super(msg);
	}
}
