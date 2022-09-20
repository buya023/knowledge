import javax.swing.JOptionPane;
public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	static String ask(String question) {
		while(true) {
			
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid =  (answer.equals("A") || answer.equals("B")|| answer.equals("C")||answer.equals("D")||answer.equals("E")) ;
			if (valid)
				return answer;
			JOptionPane.showMessageDialog(null,"Invalid answer. Please try A, B, C, D or E");
			
		}
	}
	static void check(String question, String correctAnswer) {
		nQuestions++;
		String answer = ask(question);
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
		}else {
			JOptionPane.showMessageDialog(null,  "Incorrect, The correct answer is " + correctAnswer);
		}  
	}
	
	
	public static void main(String[] args) {
		while(true) {
		String question = "Do you drink coffee in the morning?\n";
		question +="A. Yes, I am not\n";
		question +="B. Yes, I do\n";
		question +="C. No, am I\n";
		question +="D. No, I was\n";
		question +="E. Yes, I were\n";
		check(question, "B" );
		
		question = "They didn't reach an agreement ______ their differences.\n";
		question +="A. on account of\n";
		question +="B. due\n";
		question +="C. because\n";
		question +="D. owing\n";
		question +="E. and \n";
		check(question, "B" );
		
		JOptionPane.showMessageDialog(null,"You got "+ nCorrect + "correct out of " + nQuestions + "questions.");
		
	}
}
	
	
}
