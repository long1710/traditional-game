package chess;

public class Spot {
	private boolean occupied;
	private Piece piece;

	// insert piece chess here
	public Spot(Piece a) {
		this.piece = a;
		occupied = true;
	}

	public Spot() {
		occupied = false;
	}

	public void newPiece(Piece a) {
		this.piece = a;
		occupied = true;
	}

	// if spot is not occupied
	public void Title() {
		occupied = false;
	}

	public void Changed(Piece a) {
		this.piece = a;
		occupied = true;
	}

	public String toString() {
		if (occupied)
			return piece.toString();
		else
			return ".";
	}

	// if spot is occupied ? so that a move can check pass this spot
	public boolean isOccupied() {
		return occupied;
	}

	public boolean Color() {
		return piece.Color();
	}

	public Piece getPiece() {
		return piece;
	}
}
