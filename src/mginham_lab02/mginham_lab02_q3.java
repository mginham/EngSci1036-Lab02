package mginham_lab02;

import java.util.Scanner;

public class mginham_lab02_q3 {
	
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 02 Q3"
					   + "\nDate: October 3, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Display the"
					   + "\nfactorial of an integer"
					   + "\n****************************");
	} // end displayStudentInfo

	public static void main(String[] args) {
		// Display and initialize variables
		Scanner input = new Scanner(System.in);
		int number = 0, counter = 0;
		double factorial = 0; // why do we store this as a double? -> larger size than an int
		
		displayStudentInfo();
		
		// Prompt user for input (assume user will enter an int #)
		System.out.println("Input an integer number to calculate its factorial: ");
			number = input.nextInt();
		
		// Validate that the input is >= 0 (loop until !negative)
		while(number < 0) {
			System.out.println("Invalid entry! Please enter a positive integer: ");
			number = input.nextInt();
		}
		
		// Calculate the factorial
		if(number == 0)
			factorial = 1;
		else {
			factorial = number;
			
			while(++counter < number)
				factorial = factorial*(number-counter);
		}
			
		// Display result to user
		System.out.println("The resulting factorial is: " + factorial);
			
		input.close();
	} // end main

} // end class
