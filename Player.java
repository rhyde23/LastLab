package LastLab.LastLab;

public class Player {
	
	private int score;
	
	private String name;
	
	public Player(String name) {
		
		score = 0;
		
		this.name = name;
		
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
	
	public String getName() {
		
		return name;
		
	}
	
}
