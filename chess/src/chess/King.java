package chess;

public class King extends Piece {
	public boolean color;
	public int Value = 10;

	public King(boolean color) {
		super(color);
	}

	public Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2) {
		if (Math.abs(y2 - y1) < 2 && Math.abs(x2 - x1) < 2) {
			a[x2][y2].Changed(new Rook(a[x1][y1].getPiece().Color()));
			a[x1][y1].Title();
		}
		return a;
	}

	public String toString() {
		return "King";
	}

	public int Value() {
		return Value;
	}
}
