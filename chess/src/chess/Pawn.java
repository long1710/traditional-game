package chess;

public class Pawn extends Piece {
	public boolean color;
	public int Value = 1;

	public Pawn(boolean color) {
		super(color);
	}

	// implement basic feature
	public Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2) {
		System.out.println("pawn execute");
		// move down
		if (x1 < x2 && ((x2 - x1) == 1 || (x2 - x1 == 2))) {
			System.out.println("Line 1");
			for (int i = x1 + 1; i < x2; i++) {
				if (a[i][y1].isOccupied()) {
					return a;
				}
			}
			a[x2][y2].Changed(new Pawn(a[x1][y1].getPiece().Color()));
			;
			a[x1][y1].Title();
		}

		// move up
		if (x1 > x2 && (x2 - x1 == -1 || x2 - x1 == -2)) {
			System.out.println("Line 2");
			for (int i = x1 - 1; i > x2; i--) {
				if (a[i][y1].isOccupied()) {
					return a;
				}
			}
			a[x2][y2].Changed(new Pawn(a[x1][y1].getPiece().Color()));
			;
			a[x1][y1].Title();
		}
		return a;
	}

	public String toString() {
		return "Pawn";
	}

	public int Value() {
		return Value;
	}
	// TODO: Implement first move 2 jump and French cross
}
