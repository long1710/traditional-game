package chess;

public abstract class Piece {
	private boolean color; //Black = true and White = false
	public Piece(boolean a) {
		this.color = a;
	}
	public boolean Color() {
		return color;
	}
	public abstract String toString();
	public abstract Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2);
	public abstract int Value();
}
