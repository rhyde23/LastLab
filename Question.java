package LastLab;

import java.util.ArrayList;

public class Question {
	
	private ArrayList<String> multiple_choice_questions = new ArrayList<String>();
	
	private ArrayList<Character> multiple_choice_answers = new ArrayList<Character>();
	
	private ArrayList<String> multiple_choice_questions_a = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_b = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_c = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_d = new ArrayList<String>();
	
	private String question;
	
	private String a;
	
	private String b;
	
	private String c;
	
	private String d;
	
	private Character answer;
	
	public Question() {
		
		multiple_choice_questions.add("Which of the following is true about the Student Sustainability Leadership Program (SSLP)?");

		multiple_choice_questions_a.add("It is a student employment opportunity designed to prepare the next generation of environmental leaders. ");

		multiple_choice_questions_b.add("It provides hands-on experience with sustainability on campus. ");

		multiple_choice_questions_c.add("It increases student sustainability knowledge and action through peer- education. ");

		multiple_choice_questions_d.add("All of the above. ");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("Which of the following is NOT a way to conserve energy?");

		multiple_choice_questions_a.add("Unplugging any devices when not in use. ");

		multiple_choice_questions_b.add("Turning off lights when leaving the room. ");

		multiple_choice_questions_c.add("Keeping windows closed to retain heat indoors in the winter. ");

		multiple_choice_questions_d.add("Washing laundry in small loads instead of full loads. ");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("What is the name of the series of gardens around campus that attract pollinators and supports the study of pollinator activity on campus?");

		multiple_choice_questions_a.add("Bee Garden ");

		multiple_choice_questions_b.add("Pollinator Path ");

		multiple_choice_questions_c.add("Butterfly Garden ");

		multiple_choice_questions_d.add("Bee Path ");

		multiple_choice_answers.add('B');

		multiple_choice_questions.add("Where is there a bike repair station located on campus?");

		multiple_choice_questions_a.add("On the south side of O'Shaughnessy Stadium. ");

		multiple_choice_questions_b.add("Inside the secure bike storage in Frey Residence Hall. ");

		multiple_choice_questions_c.add("Inside the secure bike storage in Schoenecker Hall North. ");

		multiple_choice_questions_d.add("All of the above. ");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("Which of the following is NOT a helpful tip for reducing food waste?");

		multiple_choice_questions_a.add("Storing produce properly. ");

		multiple_choice_questions_b.add("Planning meals at the beginning of the week. ");

		multiple_choice_questions_c.add("Only purchasing what you need. ");

		multiple_choice_questions_d.add("Storing all items from the store in the refrigerator. ");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("Which of the following is NOT a way to conserve water?");

		multiple_choice_questions_a.add("Eating more plant- based meals. ");

		multiple_choice_questions_b.add("Taking shorter showers. ");

		multiple_choice_questions_c.add("Leaving the sink on while brushing your teeth. ");

		multiple_choice_questions_d.add("Only washing full loads of laundry. ");

		multiple_choice_answers.add('C');

		multiple_choice_questions.add("The Sustainable Communities Partnership (SCP) collaborates with local and regional government, non- profit, and campus partners to integrate sustainability projects important to communities into St. Thomas courses. Which of the following disciplines have courses that have included an SCP project?");

		multiple_choice_questions_a.add("Marketing ");

		multiple_choice_questions_b.add("Engineering ");

		multiple_choice_questions_c.add("Theology ");

		multiple_choice_questions_d.add("All of the above and more! ");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("At St. Thomas, plastics with a number _ in the recycling triangle are NOT accepted for recycling A. 1 B. 2 C. 4 D. 5 ?");
		
		multiple_choice_questions_a.add("1");

		multiple_choice_questions_b.add("2");

		multiple_choice_questions_c.add("4");

		multiple_choice_questions_d.add("5");
		
		multiple_choice_answers.add('C');

		multiple_choice_questions.add("All of the following items are accepted for organics recycling (compost), EXCEPT A. All food scraps B. Napkins C. All paper cups D. Flower trimmings ?");

		multiple_choice_questions_a.add("All food scraps");

		multiple_choice_questions_b.add("Napkins");

		multiple_choice_questions_c.add("All paper cups");

		multiple_choice_questions_d.add("Flower trimmings");
		
		multiple_choice_answers.add('C');

		multiple_choice_questions.add("Where is there a specialized recycling bin located on campus?");

		multiple_choice_questions_a.add("Outside the Campus Store in Murray-Herrick ");

		multiple_choice_questions_b.add("In the entrance to the Facilities & Design Center ");

		multiple_choice_questions_c.add("In the create[space] ");

		multiple_choice_questions_d.add("All of the above ");

		multiple_choice_answers.add('D');
		
		setQuestion(0);
		
		setQuestionA(0);
		
		setQuestionB(0);
		
		setQuestionC(0);
		
		setQuestionD(0);
		
		setAnswer(0);
		
	}
	
	public void setQuestion(int x) {
		
		question = multiple_choice_questions.get(x);
		
	}
	
	public void setQuestionA(int x) {
		
		a = multiple_choice_questions_a.get(x);
		
	}

	public void setQuestionB(int x) {
	
		b = multiple_choice_questions_b.get(x);
	
	}

	public void setQuestionC(int x) {
	
		c = multiple_choice_questions_c.get(x);
	
	}

	public void setQuestionD(int x) {
	
		d = multiple_choice_questions_d.get(x);
	
	}
	
	public void setAnswer(int x) {
		
		answer =  multiple_choice_answers.get(x);
		
	}
	
	public String getQuestion() {
		
		return question;
		
	}
	
	public String getQuestionA() {
		
		return a;
		
	}

	public String getQuestionB() {
	
		return b;
	
	}

	public String getQuestionC() {
	
		return c;
	
	}

	public String getQuestionD() {
	
		return d;
	
	}
	
	public Character getAnswer() {
		
		return answer;
		
	}
	
}

