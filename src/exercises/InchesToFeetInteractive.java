package exercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int feetInInches = 12;
		
		int inches = 2;
		int feet;
		int inch;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your desired inch >>>");
		inches = input.nextInt();
		
		feet = inches / feetInInches;
		inch = inches % feetInInches;
		
		System.out.println("There are " + feet + " feet and " + inch + " inches in " + inches + " inches");
		
	}

}
