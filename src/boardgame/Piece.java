package boardgame;

public abstract class Piece {

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
	
	// this boolean matrix indicates all possible movements for a specific ChessPiece indicating true in positions
	// false otherwise
	public abstract boolean[][] possibleMoves();
	
	// hook methods (methods makes a hook with a sub-class possible development
	// template method pattern
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	// template method pattern
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
