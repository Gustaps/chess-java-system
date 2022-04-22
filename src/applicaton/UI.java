package applicaton;

import boardgame.Piece;
import chess.ChessPiece;

// User Interface Class
public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		
		// considering matrix with both sizes with same size (Square matrix 8x8)
		for (int i=0; i < pieces.length; i++) {
			System.out.print((8-i) + " ");
			for (int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	// print one piece
	public static void printPiece(Piece piece) {
		if (piece == null) {
			System.out.print("-");
		} 
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
