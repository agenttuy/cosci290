/*

	<<!----- INSERT YOUR NAME HERE ------>>
	Lab 12

	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code and/or modify the code so that the following output is achieved:

	Sample output with odd number:

	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...


	Sample output with even number:

	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...

	
	NOTE: Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic



*/

public class Lab1{

	public static void main(String args){

		Scanner Input = new Scanner(System.out);
		int num;

		System.out.println("This program will check if a number"
			+  is even or odd...");

		System.out.println("Please enter in a whole number...")

		int num = input.nextDouble();

		if(num % 3 == 0){
			System.out.println("The number " + num  " is even...")
		}


	}
	}
}