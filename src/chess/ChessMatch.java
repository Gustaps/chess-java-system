package chess;

import boardgame.Board;

public class ChessMatch {
	
	// will be our core
	// a chess master must have a board
	private Board board;
	
	// creates the board with size of it
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() { 
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		// for each position in mat, we will interace piece by piece to downcast for ChessPiece
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				// downcast to ChessPiece so program can process as ChessPiece instead of Piece (general)
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}

}
