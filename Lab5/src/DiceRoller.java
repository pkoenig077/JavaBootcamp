import java.util.Scanner;

/*
 * @author Phil K
 * 
 * Dice roller
 * prompts the user to enter the number of sides on a dice
 * prompts the user to roll the dice
 * rolls a prompted number of dice and displays the results
 * prompts the user to restart
 */
public class DiceRoller {
	static Scanner scan = new Scanner(System.in);// creates a scanner

	public static void main(String[] args) {// main method

		// initialize variables
		int inputInt = 0;// must be initialized as a non valid number of sides
		String sRestart = "";
		boolean restart = getRestart(sRestart);// asks the user if they would
												// like to roll dice

		while (restart) {
			inputInt = getValidDice(inputInt);// gets the user to input an
												// integer for dice size
			getDiceRoll(inputInt);// Rolls the dice of a number and number of
									// sides that
									// the user inputs
			restart = getRestart(sRestart);// prompts the user for a restart
											// using the getRestart method
			inputInt = 0;// set inputInt to a non valid number of sides so the
							// user will be prompted for a new number of sides
		}
		System.out.println("Good Bye");
	}

	public static int getNumberRolls() {// prompts for the number of rolls to be
										// performed
		int numRolls = 0;
		numRolls = getValidNumRolls(numRolls);// uses getValidNumRolls to determine if the
											// input is an int value greater than 0
		return numRolls;
	}

	public static int getDiceRoll(int sides) {// rolls dice of the size chosen
												// the chosen number of times. 0
												// and negative values for
												// number of rolls prompt a
												// program restart
		int roll = 0;
		int numRolls = getNumberRolls();

		for (int x = 0; x < numRolls; x++) {
			roll = (int) (Math.random() * (sides) + 1);
			System.out.println("You rolled a: " + roll);
		}

		return roll;
	}

	public static int getNumRolls(int num) {// method to make sure
		// the input is an int

		System.out.println("Please enter the number rolls to be performed");
		while (!scan.hasNextInt()) {// runs whenever the scanner input is not an
									// int value
			System.out.println("Please enter the number of rolls to be performed");
			scan.nextLine();
		}
		num = scan.nextInt();
		scan.nextLine();
		return num;// returns the input once it's been verified as an integer

	}

	public static int getValidDiceSidesInt(int num) {// method to make sure
		// the input is an int

		System.out.println("Please enter the number of sides per dice (2, 4, 6, 8, 10, 12, 20, 100)");
		while (!scan.hasNextInt()) {// runs whenever the scanner input is not an
									// int value
			System.out.println("Please enter the number of sides per dice (2, 4, 6, 8, 10, 12, 20, 100)");
			scan.nextLine();
		}
		num = scan.nextInt();
		scan.nextLine();
		return num;// returns the input once it's been verified as an integer

	}

	public static boolean getValidConfirmation(String prompt) {// Method to
																// check if
																// input
		// is a valid confirmation
		if (prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("no")
				|| prompt.equalsIgnoreCase("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean getRestart(String prompt) { // prompts user for a Y,
														// N, Yes, or No input
														// using getRestartInput
		prompt = getRestartInput();
		boolean output = true;
		while (!(prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("yes")
				|| prompt.equalsIgnoreCase("no"))) {
			System.out.println("Error: Invalid Input");// when the input from
														// getRestartInput is
														// not a Y or N
			prompt = getRestartInput();// sends user back to getRestartInput to
										// resubmit input
		}
		if (prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("yes")) {
			output = true;
		} else if (prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("no")) {
			output = false;
		}
		return output;// returns true if Y or false if N. Causes the main
						// method's while loop to run on true
	}

	public static int getValidDice(int num) {// method to determine if int input
												// is an acceptable value
		while (!(num == 2 || num == 4 || num == 6 || num == 8 || num == 10 || num == 12 || num == 20 || num == 100)) {// whenever
																														// the
																														// input
																														// int
																														// value
																														// is
																														// not
			// A 2, 4, 6, 8, 10, 12, 20, or 100 send the user to the
			// getValidIntInput method

			num = getValidDiceSidesInt(num);
		}
		return num;
	}

	public static int getValidNumRolls(int num) {// method to determine if int
													// input
		// is an acceptable value
		num = 0;
		while (num <= 0) {
			// whenever the input number of rolls is more than 0
			num = getNumRolls(num);
		}
		return num;
	}

	public static String getRestartInput() {// Prompts user to roll dice
		System.out.println("Would you like to roll dice?\n(Y/N)");
		String restart = scan.nextLine();
		return restart;
	}
}
