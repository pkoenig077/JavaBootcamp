import java.util.Random;
import java.util.Scanner;

/*
 * @author Phil K
 * 
 * prompt user for a number between 1 and 100 until the user guesses the number the program generates
 * the program displays messages to indicate whether the guess is high or low
 * when the user guesses correctly, display the number of guesses to succeed
 * prompts the user to play again
 * displays a good bye message when quitting
 */
public class Bonus3 {

	static Scanner scan = new Scanner(System.in);

	static boolean getValidChoice(String prompt) {// Method to check if input
													// for restarting the game
													// is valid
		if (prompt.matches("^[yYnN]$")) {
			return true;
		} else {
			return false;
		}
	}

	static boolean getRestart(String prompt) {//method to determine if an input is y or n
		if (prompt.equalsIgnoreCase("y")) {
			return true;
		} else {
			return false;
		}
	}

	static boolean getIntWithinRange(String prompt) {// Method to check whether
														// the
														// provided number is in
														// range
		try {
			int intPrompt = Integer.parseInt(prompt);
			if (intPrompt > 0 && intPrompt <= 100) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}

	static String getInput(String prompt) {// Scanner method, returns a string

		String s = scan.nextLine();
		return s;
	}

	public static void main(String[] args) {

		// initialize variables
		String choice = "0";
		String strUserInt = "0";
		int tries = 1;

		do {
			Random randomDouble = new Random();// in order to make a new game
												// acutally use a new random
												// number this gets initialized
												// inside the loop
			int randomInt = randomDouble.nextInt(100) + 1;
			strUserInt = "0";
			choice = "0";
			while (!getIntWithinRange(strUserInt)) {
				System.out.println("Enter an integer between 1 and 100: ");
				strUserInt = getInput(strUserInt);
				while (getIntWithinRange(strUserInt)) {
					int userInt = Integer.parseInt(strUserInt);
					// Determine if the number is the same as the random number
					// here
					if (userInt != randomInt) {// Run when input is not the same
												// as the random
						System.out.println("That wasn't it");
						tries++;// increments for every attempt at guessing the
								// random
						strUserInt = "0";
						int difference = userInt - randomInt;
						if (difference < 0) {
							System.out.println("Too Low!");// print if userInt
															// is lower than
															// randomInt
						} else {
							System.out.println("Too High!");// print if userInt
															// is lower than
															// randomInt
						}
						if ((difference < 10 && difference > 0) || (difference > (-10) && difference < 0)) {
							System.out.println("Getting Close!");// prints if
																	// userInt
																	// is within
																	// 10 of
																	// randomInt
						}
						break;// sends user back to number input
					} else {
						System.out.println("You Guessed Right! \nIt took " + tries + " attempt(s)");
						break;
					}
				}
			}

			while (!getValidChoice(choice)) {
				System.out.println("Would you like to play again?\n(Y/N)");
				choice = getInput(choice);
			}
			;

		} while (getRestart(choice));
		System.out.println("Good Bye");

	}
}
