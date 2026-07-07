package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int a=(0);
		// ASK A QUESTION AND CHECK THE ANSWER
		String b=JOptionPane.showInputDialog("how many fingers should a human have");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
		if(b.equals("10")) {
			JOptionPane.showMessageDialog(null,"Correct!");
		 a+=1;
		}
	
		else {
			JOptionPane.showMessageDialog(null,"Why");
			a+=-1;
		}
				// 4.  if the user's answer was correct, add one to their score 
		String c=JOptionPane.showInputDialog("What is the point of life?");
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
if(c.equals("42")) {
	JOptionPane.showMessageDialog(null,"Correct!");
 a+=1;
}

else {
	JOptionPane.showMessageDialog(null,"What is wrong with you");
	a+=-1;
}
String d=JOptionPane.showInputDialog("what is 1+1");
// 2.  Ask the user a question 

// 3.  Use an if statement to check if their answer is correct
if(d.equals("3")) {
JOptionPane.showMessageDialog(null,"Correct!");
a+=1;
}

else {
JOptionPane.showMessageDialog(null,"Maybe correct, idk");
a+=-99999;
}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
JOptionPane.showMessageDialog(null,"Your final score is" +a);

		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
