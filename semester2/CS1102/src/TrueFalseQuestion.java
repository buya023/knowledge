import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("F")  || answer.equals("N") || answer.equals("NO")) 
				answer =  "FALSE";
			if (answer.equals("T")  || answer.equals("Y") || answer.equals("YES")) 
				answer = "TRUE";
			
			boolean valid = (answer.equals("TRUE") || answer.equals("FALSE"));
			if (valid) 
				return answer; 
			JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
			
				
		}		
}
	TrueFalseQuestion(String question, String answer) {
		super.question = "TRUE or FALSE: "+question;
		
		answer = answer.toUpperCase();
		if (answer.equals("F") || answer.equals("N") || answer.equals("NO"))
			correctAnswer = "FALSE";
		else if (answer.equals("T")  || answer.equals("Y") || answer.equals("YES")) 
			correctAnswer = "TRUE";
		
	}
	
	
}
