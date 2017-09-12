package gameZone;

import java.util.Scanner;
 
public class RandomGuessMatch {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Guess a number between 1 and 5: ");
		int guess = sc.nextInt();
		
		int random = 1 + (int)(Math.random() * 5);
		
		boolean isEqual = (random == guess);
		
		System.out.println();
		System.out.println(isEqual + " - the number is " + random + ".");
	} 
	
 }
