package LastLab.LastLab;

public class Player {
	
	private int score;
	
	public Player() {
		
		score = 0;
		
	}
	
	public void incrementScore() {
		
		score ++;
		
	}
	
	public void resetScore() {
		
		score = 0;
		
	}
	
	public int getScore() {
		
		return score;
		
	}
	
}
