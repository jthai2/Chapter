package exercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numberOfKM = 1.852;
		double numberOfMiles= 1.150779; 
		
		double numberOfNauticalMiles = 4;
		double nauticalMilesKm;
		double nauticalMilesM;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter nautical mile >>>");
		numberOfNauticalMiles = input.nextInt();
		
		
		nauticalMilesKm = numberOfKM * numberOfNauticalMiles;
		nauticalMilesM = numberOfMiles * numberOfNauticalMiles;
		
		System.out.println("There are " + nauticalMilesKm + " kilometers in " + numberOfNauticalMiles +  " nautical miles "
				+ "and there are " + nauticalMilesM + " miles in " + numberOfNauticalMiles + " nautical mile. ");

	}

}
