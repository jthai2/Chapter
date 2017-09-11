package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int difference;
		int random;
		int number;
		
		random = 1 + (int)(Math.random() * 5);
		
		JOptionPane.showMessageDialog(null, "Guess random number between 1 and 5");
		number = input.nextInt();
		
		difference = random - number;
		
		JOptionPane.showMessageDialog(null, "Difference of random nuumber and your guessed number is" + difference);
		JOptionPane.showMessageDialog(null, "Random number is " + random);
		
		
		
	}

}
