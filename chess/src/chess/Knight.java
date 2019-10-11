package chess;

public class Knight extends Piece {
	public boolean color;
	public int value = 3;

	public Knight(boolean color) {
		super(color);
	}

	public Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2) {
		// move up
		boolean move = false;
		System.out.println("Knight execute");
		if (Math.abs(y1 - y2) == 2 && Math.abs(x1 - x2) == 1)
			move = true;
		if (Math.abs(y1 - y2) == 1 && Math.abs(x1 - x2) == 2)
			move = true;
		if (move) {
			a[x2][y2].Changed(new Knight(a[x1][y1].getPiece().Color()));
			a[x1][y1].Title();
		}
		return a;
	}

	public String toString() {
		return "Knight";
	}

	public int Value() {
		return value;
	}

}
