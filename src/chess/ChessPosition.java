package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	
	protected Position toPosition() {
		// matrix chess a1 = matrix 7,0
		// matrix chess a8 = matrix 0,0
		// matrix row = 8 - matrix chess
		// matrix column = matrix chess - 'a'
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) (position.getColumn() + 'a'), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row; // "" is forcing compiler to process strings concatenation
	}
}
