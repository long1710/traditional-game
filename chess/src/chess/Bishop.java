package chess;

public class Bishop extends Piece {
	public boolean color;
	public int value = 3;

	public Bishop(boolean color) {
		super(color);
	}

	// implement basic feature
	public Spot[][] movePattern(Spot[][] a, int x1, int y1, int x2, int y2) {
			// move North West ( up left)
			if (y1 > y2 && x1 > x2) {
				System.out.println("this up left exe");
				for (int i = 1; i < x1 - x2; i++) {
					if (a[x1 - 1][y1 - 1].isOccupied())
						return a;
				}
				a[x2][y2].Changed(new Bishop(a[x1][y1].getPiece().Color()));
				;
				a[x1][y1].Title();
			}
			// move South West ( down left)
			if (y1 > y2 && x1 < x2) {
				System.out.println("this down left exe");
				for (int i = 1; i < x2 - x1; i++) {
					if (a[x1 + 1][y1 - 1].isOccupied())
						return a;
				}
				a[x2][y2].Changed(new Bishop(a[x1][y1].getPiece().Color()));
				;
				a[x1][y1].Title();
			}
			// move North East ( up right )
			if (y1 < y2 && x1 > x2) {
				System.out.println("this up right exe");
				for (int i = 1; i < x2 - x1; i++) {
					if (a[x1 - 1][y1 + 1].isOccupied())
						return a;
				}
				a[x2][y2].Changed(new Bishop(a[x1][y1].getPiece().Color()));
				;
				a[x1][y1].Title();
			}
			// move South East ( down right)
			if (y2 > y1 && x1 < x2) {
				System.out.println("this down right exe");
				for (int i = 1; i < x2 - x1; i++) {
					if (a[x1 + 1][y1 + 1].isOccupied())
						return a;
				}
				a[x2][y2].Changed(new Bishop(a[x1][y1].getPiece().Color()));
				;
				a[x1][y1].Title();
			}
		
		return a;
	}

	public String toString() {
		return "Bishop";
	}

	public int Value() {
		return value;
	}
	// TODO: add move is valid or not
}
