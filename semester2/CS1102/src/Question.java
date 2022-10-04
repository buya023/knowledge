import javax.swing.JOptionPane;

public abstract class Question {
	
	static int nQuestions = 0;
	static int nCorrect = 0; 
	String question;
	String correctAnswer;
	abstract String ask();
	void check() {
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect, The correct answer is " + correctAnswer);
		}
		}
	  
	  static void showResult() {   // shows results.
		 JOptionPane.showMessageDialog(null, "You got " + nCorrect + " correct out of "+ nQuestions + " questions. ");
		 
		
	  }
	  
	  
}
