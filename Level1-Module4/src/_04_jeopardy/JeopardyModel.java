package _04_jeopardy;

import java.util.HashMap;

public class JeopardyModel {

	private HashMap<String, String> questions = new HashMap<String, String>();	
	private HashMap<String, String> answers = new HashMap<String, String>();
	private int score = 0;
	
	private String currentQuestion;

	JeopardyModel() {
		
		/* Put "real" questions and answers below */

		questions.put("100", "This is the question for 100 points");
		questions.put("200", "This is the question for 200 points");
		questions.put("400", "This is the question for 400 points");
		questions.put("800", "This is the question for 800 points");
	
		answers.put("100", "This is the answer for 100 points");
		answers.put("200", "This is the answer for 200 points");
		answers.put("400", "This is the answer for 400 points");
		answers.put("800", "This is the answer for 800 points");
	}
	
	public int getScore() {
		return score;
	}
	
	public String getAnswerForCurrentQuestion() {
		return answers.get(currentQuestion);
	}
	
	public String getQuestionForAmount(String amount) {
		currentQuestion = amount;
		return questions.get(amount);
	}

	
	public boolean checkPlayerAnswer(String playerAnswer) {
	
		
		// Get the answer for the current question (use the method above)
	
		// If the playerAnswer is correct

				// Increase the score by the amount of the current question
	
				// return true


		// Otherwise

				// Decrease the score by the amount of the current question
	
				// return false 


	}

}