package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		
		random = 1 + (int)(Math.random() * 5);
		
		JOptionPane.showMessageDialog(null, "Guess a number");
		
		
	}

}
