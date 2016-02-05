import java.util.Scanner;

/*
 * @author Phil K
 * 
 * Finds the factorial of an integer between 1 and 10 using a recursive method
 */

public class Lab4 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {// main method

		// initialize variables
		int inputInt = 0;//must be initialized below 1 or above 10 for the getValidIntRange method to function properly
		String sRestart = null;
		boolean restart = getRestart(sRestart);//asks the user if they would like to find the factorial of a number between 1 and 10

		while (restart) {
			inputInt = getValidIntRange(inputInt);// gets the user to input an
													// integer between 1 and 10
			long factorial = getFactorial(inputInt);// computes the factorial of
													// the user input
			System.out.println("The factorial of your input is: " + factorial);
			restart = getRestart(sRestart);// prompts the user for a restart using the getRestart method
			inputInt = 0;//set inputInt to 0 so the loop performs properly
		}
		System.out.println("Good Bye");
	}

	public static long getFactorial(int n) {// method to find factorial
											// returns result
											// runs recursively until n is 1
		long factorialResult;
		if (n == 1 || n==0) {
			return 1;
		}
		factorialResult = n * getFactorial(n - 1);
		return factorialResult;// returns the result as a long
	}

	public static int getValidIntInput(int num) {// method to make sure
													// the input is an int
		
		System.out.println("Please enter an integer between 1 and 10");
		while (!scan.hasNextInt()) {// runs whenever the scanner input is not an
									// int value
			System.out.println("Please enter an integer between 1 and 10");
			scan.nextLine();
		}
		num = scan.nextInt();
		scan.nextLine();
		return num;// returns the input once it's been verified as an integer

	}

	public static int getValidIntRange(int num) {
		while (!(num > 0 && num <= 10)) {// whenever the input int value is not
											// between 1 and 10 sends the user
											// to the getValidIntInput method
			num = getValidIntInput(num);
		}
		return num;// returns the in input once it's been determined that it's
					// between 1 and 10
	}

	public static boolean getRestart(String prompt) { 
		prompt = getRestartInput();//prompts the user for a y or n input with the getRestartInput method
		boolean output = true;
		while (!prompt.matches("^[yYnN]")) {
			System.out.println("Error: Invalid Input");//when the input from getRestartInput is not a Y or N 
			prompt = getRestartInput();//sends user back to getRestartInput to resubmit input
		}
		if (prompt.equalsIgnoreCase("y")) {
			output = true;
		} else if (prompt.equalsIgnoreCase("n")) {
			output = false;
		}
		return output;//returns true if Y or false if N. Causes the main method's while loop to run on true
	}

	public static String getRestartInput() {// Prompts user to find a factorial
		System.out.println("Would you like to find a factorial?\n(Y/N)");
		String restart = scan.nextLine();
		return restart;
	}
}
