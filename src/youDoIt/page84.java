package youDoIt;

import java.util.Scanner;

public class page84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name>> ");
		name = input.nextLine();
		System.out.print("Please enter an integer");
		anInt = input.nextInt();
		System.out.print("Please enter an byte integer>> ");
		aByte = input.nextByte();
		System.out.print("Please enter an short integer>> ");
		aShort = input.nextShort();
		System.out.print("Please enter an long integer>> ");
		aLong = input.nextLong();
		
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Thank you " + name);
	}

}
