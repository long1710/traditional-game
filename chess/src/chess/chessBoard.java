package chess;

import java.util.ArrayList;
import java.util.List;

public class chessBoard {
	public Player Long = new Player("Long", true);
	public Player Hao = new Player("Li", false);
	private Spot[][] board_play = new Spot[9][9];

	public void Board() {
	}

	public void Initialize() {

		for (int i = 1; i <= 8; i++)
			for (int n = 1; n <= 8; n++) {
				// board_answer[i][n] = 0;
				board_play[i][n] = new Spot();
			}

		// initialize board, lower case for white and upper case for Black
		for (int i = 1; i <= 8; i++) // initialize board, start with pawn
		{
			board_play[2][i] = new Spot(new Pawn(true));
			board_play[7][i] = new Spot(new Pawn(false));
		}
		// initialize white
		board_play[1][1] = new Spot(new Rook(true));
		board_play[1][2] = new Spot(new Knight(true));
		board_play[1][3] = new Spot(new Bishop(true));
		board_play[1][4] = new Spot(new Queen(true));
		board_play[1][5] = new Spot(new King(true));
		board_play[1][6] = new Spot(new Bishop(true));
		board_play[1][7] = new Spot(new Knight(true));
		board_play[1][8] = new Spot(new Rook(true));

		// initialize black
		board_play[8][1] = new Spot(new Rook(false));
		board_play[8][2] = new Spot(new Knight(false));
		board_play[8][3] = new Spot(new Bishop(false));
		board_play[8][4] = new Spot(new King(false));
		board_play[8][5] = new Spot(new Queen(false));
		board_play[8][6] = new Spot(new Bishop(false));
		board_play[8][7] = new Spot(new Knight(false));
		board_play[8][8] = new Spot(new Rook(false));
		// board_play[3][4] = new Spot(new Bishop(false));
	}

	public void PrintBoard() {

		for (int i = 1; i <= 8; i++) {
			for (int n = 1; n <= 7; n++)
				System.out.printf("%10s", board_play[i][n].toString());
			System.out.printf("%10s\n\n\n", board_play[i][8].toString());
		}
		System.out.printf("\n\n");
	}

	public boolean validChoose(int x, int y, boolean color) {// check if the choosen position is a piece and player take
																// the right color
		if (board_play[x][y].toString().equals(".") || board_play[x][y].Color() == color) {
			return false;
		} else
			return true;
	}

	public void move(int x1, int y1, int x2, int y2, boolean color) { // take variable of where and where to
		int holder_score = 0;
		String piece_holder = "";
		if (validChoose(x1, y1, color)) {// check if the spot has a piece in it
			if (board_play[x2][y2].isOccupied()) {
				holder_score = board_play[x2][y2].getPiece().Value();
				piece_holder = board_play[x2][y2].toString();
			}
			board_play[x1][y1].getPiece().movePattern(board_play, x1, y1, x2, y2);
			if (board_play[x2][y2].toString().equals(piece_holder)) {
				addScore(holder_score, color);
			}
		}
	}

	public void addScore(int value, boolean color) {
		if (color) {
			Long.addScore(value);
		} else
			Hao.addScore(value);
	}
	
	public boolean gameOver(int x2, int y2) {
		if(board_play[x2][y2].toString().equals("King"))
			return true;
		return false;
	}
}
