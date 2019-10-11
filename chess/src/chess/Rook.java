package chess;

public class Rook extends Piece {
	public int value = 5;

	public Rook(boolean color) {
		super(color);
	}

	// implement basic feature
	public Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2) {
		// move right
		if (x1 == x2 || y1 == y2) {
			if (y1 < y2) {
				System.out.println("move right");
				for (int i = y1 + 1; i < y2; i++) {
					if (a[x1][i].isOccupied()) {
						return a;
					}
				}
				a[x2][y2].Changed(new Rook(a[x1][y1].getPiece().Color()));
				a[x1][y1].Title();
			}

			// move down

			if (x1 < x2) {
				System.out.println("move down ");
				for (int i = x1 + 1; i < x2; i++) {
					if (a[i][y1].isOccupied()) {
						return a;
					}
				}
				a[x2][y2].Changed(new Rook(a[x1][y1].getPiece().Color()));
				a[x1][y1].Title();
			}
			// move up
			if (x1 > x2) {
				System.out.println("move up");
				for (int i = x1 - 1; i > x2; i--) {
					if (a[i][y1].isOccupied()) {
						return a;
					}
				}
				a[x2][y2].Changed(new Rook(a[x1][y1].getPiece().Color()));
				;
				a[x1][y1].Title();
			}
			// move right
			if (y1 > y2) {
				System.out.println("move left");
				for (int i = y1 - 1; i > y2; i--) {
					if (a[x1][i].isOccupied()) {
						return a;
					}
				}
				a[x2][y2].Changed(new Rook(a[x1][y1].getPiece().Color()));
				a[x1][y1].Title();
			}
		}
		return a;
	}

	public String toString() {
		return "Rook";
	}

	public int Value() {
		return value;
	}

	// TODO : Implement Castleif
}
