package mginham_lab02;

import java.util.Scanner;

public class mginham_lab02_q2 {

	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 02 Q2"
					   + "\nDate: October 3, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: calculates"
					   + "\nstatistics on a set of"
					   + "\ninteger inputs"
					   + "\n****************************");
	} // end displayStudentInfo
	
	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		int iterations = 0, counter = 0, num = 0, sumOfInts = 0, maxVal = 0, minVal = 0, evenCount = 0, oddCount = 0;
		double meanVal = 0;
		
		displayStudentInfo();
		
		// Prompt user to input size of integer set
		do {
			System.out.println("Enter an integer number for the number of loop iterations: ");
				iterations = input.nextInt();
		} while(iterations <= 0); // validate that the entered int is > 0 (assume user will only enter integer #)
		
		// Prompt user for int input (assume user will enter int values, no validation required)
		while(counter++ < iterations) { // could have also used a for loop
			System.out.println("\nEnter integer " + counter + ":");
				num = input.nextInt();
				
			// Calculate mean
			sumOfInts = sumOfInts + num;
			meanVal = (double)sumOfInts / (double)counter;
			// Calculate max
			if(counter == 1 || num > maxVal) // if there is only 1 int, set it to max
				maxVal = num;
			// Calculate min
			if(counter == 1 || num < minVal) // if there is only 1 int, sit it to min
				minVal = num;
			// Calculate even count
			if(num%2 == 0)
				evenCount++;
			// Calculate odd count
			else
				oddCount++;
			
			// Display calculations to user
			System.out.println("The mean of " + counter + " input(s) is:\t" + meanVal
						   + "\nMax value:\t\t\t" + maxVal
						   + "\nMin value:\t\t\t" + minVal
						   + "\nEven count:\t\t\t" + evenCount
						   + "\nOdd count:\t\t\t" + oddCount);
		}
		
		System.out.println("\nGoodbye!");
		
		input.close();
	} // end main

} // end class
