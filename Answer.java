package LastLab.LastLab;

//Answer Interface
public interface Answer {
    
    //Method to check if the response is correct
    boolean isCorrect(Character response);
    
    //Method to get the current question index
    int getQuestionIndex();
    
    //Method to move to the next question
    void nextQuestion();
    
}