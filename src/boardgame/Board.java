package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	// each board has N pieces
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// Board class does not return pieces, but ont piece at a time. 
	// That's why does not exist getter and setter for pieces
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	

}
