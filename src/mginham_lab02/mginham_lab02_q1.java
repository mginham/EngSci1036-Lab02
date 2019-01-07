package mginham_lab02;

import java.util.Scanner;

public class mginham_lab02_q1 {
	
	public static void displayMenu() {
		System.out.println("\n****************************");
		System.out.println("***** Value Conversion *****");
		System.out.println("****************************\n");
		
		System.out.println("* 1. Celsius to Fahrenheit *");
		System.out.println("* 2. Centimeters to Inches *");
		System.out.println("* 3. Meters to Feet        *");
		System.out.println("* 4. Km/h to MPH           *");
		System.out.println("* 5. Exit                  *\n");
	} // end displayMenu
	
	public static void celToFahr() {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double temp = -1;
		boolean icePossible = false;
		
		// Prompt user for input
		System.out.println("Enter a temperature (celsius):");
			temp = input.nextDouble();
		
		// Check for possibility of ice
		if(temp < 0)
			icePossible = true;
			
		// Convert temperature from celsius to fahrenheit
		temp = temp*9/5 + 32;
		
		// Display result to user
		System.out.println("The temperature is " + temp + " in fahrenheit");
		
		if(icePossible)
			System.out.println("Ice may be possible, please be careful.");
	} // end celToFahr
	
	public static void centiToInch() {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double length = -1;
		
		// Prompt user for input
		do {
			System.out.println("Enter a length (cm):");
				length = input.nextDouble();
			
			if(length < 0)
				System.out.println("Invalid input. Length must be non-negative");
		} while(length < 0); // loop until a non-negative length is inputed
		
		// Convert centimeters to inches
		length = length * 0.39;
		
		// Display result to user
		System.out.println("The length is " + length + " in inches");
	} // end centiToInch
	
	public static void meterToFeet() {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double length = -1;
		
		// Prompt user for input
		do {
			System.out.println("Enter a length (m):");
				length = input.nextDouble();
				
			if(length < 0)
				System.out.println("Invalid input. Length must be non-negative");
		} while(length < 0); // loop until a non-negative length is inputed
				
		// Convert meters to feet
		length = length * 3.28;
		
		// Display result to user
		System.out.println("The length is " + length + " in feet");
	} // end meterToFeet
	
	public static void kmToMp() {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double speed = -1;
		
		// Prompt user for input
		do {
			System.out.println("Enter a speed (Km/h):");
				speed = input.nextDouble();
				
			if(speed < 0 || speed > 160)
				System.out.println("Invalid input. Speed must be between 0 and 160 Km/h");
		} while(speed < 0 || speed > 160); // loop until a non-negative speed that is less than or equal to 160 is inputed
		
		// Convert Km/h to MPH
			speed = speed / 1.609;
		
		// Display result to user
		System.out.println("The speed is " + speed + " in MPH");
	} // end kmToMp

	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		int menuAns = -1;
		
		// Display information & question to user
		System.out.println("****************************"
					   + "\nES1036: Lab 02 Q1"
					   + "\nDate: October 3, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Displays a menu"
					   + "\nwith four conversion"
					   + "\noptions and exit, and can"
					   + "\nperform the conversions"
					   + "\n****************************");
		
		do {
			displayMenu();
			
			// Prompt user for input
			System.out.println("Please input a choice (1-5):");
				menuAns = input.nextInt();
			
			switch(menuAns) {
				case 1: celToFahr();
					break;
				case 2: centiToInch();
					break;
				case 3: meterToFeet();
					break;
				case 4: kmToMp();
					break;
				case 5: // exit
					break;
			}
		} while(menuAns != 5); // loop so long as the user doesn't choose to exit
		
		System.out.println("\n----------------------------"
						 + "\n         Goodbye! "
						 + "\n----------------------------");
		
		input.close();
	} // end main

} // end class
