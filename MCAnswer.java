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
		
		int real_index = getRealIndex(question_index);
		
		setQuestion(real_index);
		
		setQuestionA(real_index);
		
		setQuestionB(real_index);
		
		setQuestionC(real_index);
		
		setQuestionD(real_index);
		
		setAnswer(real_index);
		
	}
	
}