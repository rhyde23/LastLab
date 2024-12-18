package LastLab.LastLab;

public class TFAnswer extends Question implements Answer {
	
	private int question_index;
	
	public TFAnswer() {
		
		super();
		
		question_index = 0;
		
	}
	
	@Override
	public boolean isCorrect(Character response) {
		
		return response.equals(getTFAnswer());
		
	}
	
	@Override
	public int getQuestionIndex() {
		
		return question_index;
		
	}
	
	@Override
	public void nextQuestion() {
		
		question_index ++;
		
		int real_index = getRealIndex(question_index);
			
		setTFQuestion(real_index);
			
		setTFAnswer(real_index);
		
	}

}
