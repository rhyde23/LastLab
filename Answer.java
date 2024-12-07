package LastLab;

public class Answer extends Question {
	
	private int question_index;
	
	public Answer() {
		
		super();
		
		question_index = 0;
		
	}
	
	
	public boolean isCorrect(Character response) {
		
		return response.equals(getAnswer());
		
	}
	
	public int getQuestionIndex() {
		
		return question_index;
		
	}
	
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