package LastLab.LastLab;

public class MCAnswer extends Question implements Answer {
	
	private int question_index;
	
	public MCAnswer() {
		
		super();
		
		question_index = 0;
		
	}
	
	@Override
	public boolean isCorrect(Character response) {
		
		return response.equals(getAnswer());
		
	}
	
	@Override
	public int getQuestionIndex() {
		
		return question_index;
		
	}
	
	@Override
	public void nextQuestion() {
		
		question_index ++;
		
		setQuestion(question_index);
		
		setQuestionA(question_index);
		
		setQuestionB(question_index);
		
		setQuestionC(question_index);
		
		setQuestionD(question_index);
		
		setAnswer(question_index);
		
	}
	
}