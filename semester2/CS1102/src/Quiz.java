

public class Quiz {
public static void main(String[] args) {
	
	Question question1 = new MultipleChoiceQuestion(
			 "I'm very happy _____ in India. I really miss being there.?",
			 "to live",
			 "to have lived",
			 "to be lived",
			 "to be living",
			 "living",
			 "b");
	question1.check();
	
	Question question2 = new MultipleChoiceQuestion(
			"He didn't speak English, _____ it was difficult to make him understand what he had to do.\n",
			 "although",
			 "thus",
			 "so",
			 "soo",
			 "because",
			 "c");
	question2.check();
	
	Question question3 = new MultipleChoiceQuestion(
			"They didn't reach an agreement ______ their differences.\n",
			 "on account of",
			 "due to",
			 "because",
			 "owing",
			 "and",
			 "b");
	question3.check();
	
	Question question4 = new MultipleChoiceQuestion(
			"The best way to learn a language is ______ a little every day.",
			 "speak",
			 "in speaking",
			 "to speaking",
			 "by speaking",
			 "speaking",
			 "d");
	question4.check();
	
	Question question5 = new MultipleChoiceQuestion(
			"I wish I _____ those words. But now it's too late.",
			 "not having said",
			 "have never said",
			 "never said",
			 "had never said",
			 "said",
			 "d");
	question5.check();
	
//	MultipleChoiceQuestion.showResult();
	
	
	Question TFquestion1 = new TrueFalseQuestion(
			  "is dog animal?",
			  "Y"); 
	TFquestion1.check();
	Question TFquestion2 = new TrueFalseQuestion(
			  "are sharks mammals?",
			  "N"); 
	TFquestion2.check();
	Question TFquestion3 = new TrueFalseQuestion(
			  " Is the blue whale the biggest animal to have ever lived?",
			  "Y"); 
	TFquestion3.check();
	Question TFquestion4 = new TrueFalseQuestion(
			  "Are bats blind?",
			  "f"); 
	TFquestion4.check();
	Question TFquestion5 = new TrueFalseQuestion(
			  "Are you animal?",
			  "Y"); 
	TFquestion5.check();
	
	TrueFalseQuestion.showResult();
	}

		
	
}


