package LastLab.LastLab;

import java.util.ArrayList;

import java.util.Collections;

public class Question {
	
	private ArrayList<String> multiple_choice_questions = new ArrayList<String>();
	
	private ArrayList<Character> multiple_choice_answers = new ArrayList<Character>();
	
	private ArrayList<String> multiple_choice_questions_a = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_b = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_c = new ArrayList<String>();
	
	private ArrayList<String> multiple_choice_questions_d = new ArrayList<String>();
	
	private ArrayList<String> tf_questions = new ArrayList<String>();
	
	private ArrayList<Character> tf_choice_answers = new ArrayList<Character>();
	
	private ArrayList<Integer> indexes;
	
	private String question;
	
	private String a;
	
	private String b;
	
	private String c;
	
	private String d;
	
	private Character answer;
	
	private String tf_question;
	
	private Character tf_answer;
	
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
		
		multiple_choice_questions.add("Dining Services reduces waste by...?");
		
		multiple_choice_questions_a.add("Safely recovering leftover food to be donated.");
		
		multiple_choice_questions_b.add("Offering reusable to-go containers in T\'s.");
		
		multiple_choice_questions_c.add("Offering a discount for bringing your own reusable cup to campus coffee shops.");
		
		multiple_choice_questions_d.add("All of the above.");

		multiple_choice_answers.add('D');

		multiple_choice_questions.add("At St. Thomas, plastics with a number _ in the recycling triangle are NOT accepted for recycling");
		
		multiple_choice_questions_a.add("1");

		multiple_choice_questions_b.add("2");

		multiple_choice_questions_c.add("4");

		multiple_choice_questions_d.add("5");
		
		multiple_choice_answers.add('C');

		multiple_choice_questions.add("All of the following items are accepted for organics recycling (compost), EXCEPT");

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
		
		tf_questions.add("T/F: The Student Sustainability Leadership Program (SSLP) is only for students with environmental majors.");

		tf_questions.add("T/F: Keeping blinds closed during the hottest parts of the day to limit excess heat in the summer is a way to conserve energy.");

		tf_questions.add("T/F: The Pollinator Path is a series of gardens around campus which attract pollinators and support the study of pollinator activity on campus.");

		tf_questions.add("T/F: A bike repair station is located between ASC and O'Shaughnessy Stadium.");

		tf_questions.add("T/F: You get 25 cents off for bringing a reusable cup at campus coffee shops.");

		tf_questions.add("T/F: The water that collects in the storm drains located on campus and the surrounding streets ends up in the Mississippi River.");

		tf_questions.add("T/F: St Thomas does not offer a sustainability minor.");

		tf_questions.add("T/F: Tommies Closet is a monthly pop-up that allows students to shop for secondhand clothes donated by fellow Tommies.");

		tf_questions.add("T/F: Plastic bags can be recycled in the blue recycling bins around campus.");

		tf_questions.add("T/F: At St Thomas, items that are placed in the green organics recycling bins are turned into compost that can be used in gardens and lawns.");

		tf_questions.add("T/F: Plastic bags are accepted for recycling at the specialized recycling stations on campus.");
		
		tf_choice_answers.add('F');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('F');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('F');
		
		tf_choice_answers.add('T');
		
		tf_choice_answers.add('F');
		
		indexes = new ArrayList<>();
		
        for (int i = 0; i <= 10; i++) {
        	
        	indexes.add(i);
            
        }

        Collections.shuffle(indexes);
        
        setQuestion(indexes.get(0));
		
		setQuestionA(indexes.get(0));
		
		setQuestionB(indexes.get(0));
		
		setQuestionC(indexes.get(0));
		
		setQuestionD(indexes.get(0));
		
		setAnswer(indexes.get(0));
		
		setTFQuestion(indexes.get(0));
			
		setTFAnswer(indexes.get(0));
		
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
	
	public void setTFQuestion(int x) {
		
		tf_question = tf_questions.get(x);
		
	}
	
	public void setTFAnswer(int x) {
		
		tf_answer = tf_choice_answers.get(x);
		
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
	
	public String getTFQuestion() {
		
		return tf_question;
		
	}
	
	public Character getTFAnswer() {
		
		return tf_answer;
		
	}
	
	public int getRealIndex(int x) {
		
		return indexes.get(x);
		
	}
	
}

