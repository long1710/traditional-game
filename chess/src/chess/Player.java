package chess;

public class Player {
	private String name;
	private boolean side;
	private int score = 0;
	private int gameWon = 0;
	private int	gameLose = 0;
	private int gameDraw = 0;
	
	public Player(String name, boolean color) {//true is black and white is false
		this.name = name;
		this.side = color; 
	}
	
	public void addWin() {
		gameWon++;
	}
	public void addLose() {
		gameLose++;
	}
	public void addDraw() {
		gameDraw++;
	}
	public void addScore(int score) {
		this.score += score;
	}
	public void information() {
		String information = "name: " + name + "\n" + "score:" + score;
		System.out.println(information);
	}
	
	
}
