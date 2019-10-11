package chess;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class chessGame {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		chessBoard start = new chessBoard();
		boolean retry = true;
		start.Initialize();
		start.PrintBoard();
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

		/*System.out.println("Enter Player 1 name: ");
		Player name1 = new Player(sc.next(), true);// true = black and false = white
		System.out.println("Enter Player 2 name: ");
		Player name2 = new Player(sc.next(), false);*/
		boolean turn = false; // white go first
		// start the game
		boolean gameover = false;
		while (!gameover) {
			turn = !turn;
			start.Long.information();
			start.Hao.information();
			if(turn)
			{
				System.out.println("it is white turn");
			}
			else 
			{
			System.out.println("it is black turn");
			}
				System.out.println("Where?(please give 2 number )");
				x1 = sc.nextInt();
				y1 = sc.nextInt();

				System.out.print("Where do you want to move it to ? (please give 2 number)");
				x2 = sc.nextInt();
				y2 = sc.nextInt();
				start.move(x1, y1, x2, y2, turn);
				start.PrintBoard();
		}
		start.gameOver(x2, y2);
	}
}
