package tutorials;

import javax.swing.JOptionPane;

public class HelloNameDialogue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		result = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null,  "Hello, " + result + "!");


	}

}
