package gameZone;

import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int difference;
		int number;
		int random;
		
		Scanner input = new Scanner(System.in);
		
		random = 1 + (int)(Math.random() * 5);
		
		System.out.println("Random number is " +1 + (int)(Math.random() * 5));
		amountEntered = input.nextInt();
		
		difference = random - number;
		
		System.out.println("Difference of random nuumber and your guessed number is" + difference + "Random number is " + random);
		
		
		
	}

}
