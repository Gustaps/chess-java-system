package boardgame;

public class Piece {

	protected Position position; // Matrix position, that's why is protected
	private Board board; // Every piece is associated with ONE board
	public Piece(Board board) {
		this.board = board;
		position = null; // is not positioned yet
	}
	
	// only same package classes and sub-classes of Piece can get Board
	// Board Class is used internally by layer boardGame and not visible to upper layer chessgame
	protected Board getBoard() {
		return board; 
	}
}
