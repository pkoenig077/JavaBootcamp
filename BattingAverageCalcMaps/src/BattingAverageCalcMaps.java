import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * @author Phil K
 * 
 * Lab 8 using maps
 * 
 * TODO use maps instead of arrays
 * 
 * HashMap should be <String, HashMap<String,Double>> inner map is data we care about(batting avg and slug%) outer is batter name
 * 
 * make some kind of for loop for adding number of at bats/bases earned for each batter
 * make methods for calculating AVG and slug%
 * 
 * print out batter name + stats
 * 
 * add a restart while loop
 */
public class BattingAverageCalcMaps {
	// Decimal format to show 3 decimals
	public static DecimalFormat df = new DecimalFormat("#0.000");

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String moreBatters = "Would you like to add another batter?\n(Y)es/(N)o";
		
		HashMap<String, ArrayList<Integer>> batters = new HashMap<>();// Hash map to store
															// player name and
															// bases earned per at bat

		boolean addMoreBatters = true;

		while (addMoreBatters == true) {
			batters.put(getBatterName(sc), getBasesEarnedWithinRange(sc));
			//prompts for Batter name
			//prompts for number of at bats
			//prompts for bases earned for each at bat
			addMoreBatters = getAddMoreBatters(sc, moreBatters);// prompts for more batters
		}
		
		System.out.println();

	}

	public static int getBasesEarned(Scanner sc) {
		// prompts user for bases earned
		// checks that input is an int
		int basesEarned = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number of bases earned\n(0-4)");
			if (sc.hasNextInt()) {
				basesEarned=sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return basesEarned;
	}

	public static ArrayList<Integer> getBasesEarnedWithinRange(Scanner sc) {
		// checks that bases earned is a value from 0 to 4
		// returns number of bases earned
		int atBats = getNumAtBats(sc);
		ArrayList<Integer> basesEarned = new ArrayList<>();
		boolean isValid = false;
		int bases = 0;
		for (int i = 0; i < atBats; i++) {

			while (isValid == false) {
				bases=getBasesEarned(sc);
				if (bases< 0 || bases > 4) {
					System.out.println("Error! Number must be between 0 and 4");
				}

				else {
					isValid = true;
					basesEarned.add(i);
				}
			}
		}
		return basesEarned;
	}

	public static int getAtBats(Scanner sc) {
		// prompts user for number of at bats that a player has. Value must be a
		// positive integer
		int atBats = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number of at bats");
			if (sc.hasNextInt()) {
				atBats = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return atBats;
	}

	public static int getNumAtBats(Scanner sc) {
		// checks that the number of at bats is more than 0
		// returns number of at bats
		int atBats = 0;
		boolean isValid = false;
		while (isValid == false) {
			atBats = getAtBats(sc);
			if (atBats < 0)
				System.out.println("Error! Number must be greater than " + 0);
			else
				isValid = true;
		}
		return atBats;
	}

	public static String getBatterName(Scanner sc) {// prompts input from user,
		// accepts any input,
		// returns as a String
		System.out.println("Enter Batter name: ");
		String prompt = sc.nextLine();

		return prompt;
	}

	public static String getAddMoreBattersInput(Scanner sc, String moreBatters) {// Prompts user to
																// add more batters
		System.out.println(moreBatters);
		String restart = sc.nextLine();
		return restart;
	}

	public static boolean getAddMoreBatters(Scanner sc, String moreBatters) { // prompts
															// user for
															// a Y,
		// N, Yes, or No input
		// using getRestartInput
		String prompt = getAddMoreBattersInput(sc, moreBatters);
		boolean output = true;
		while (!(prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("yes")
				|| prompt.equalsIgnoreCase("no"))) {
			System.out.println("Error: Invalid Input");// when the input from
														// getRestartInput is
														// not a Y or N
			prompt = getAddMoreBattersInput(sc, moreBatters);// sends user back to
												// getRestartInput
			// to
			// resubmit input
		}
		if (prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("yes")) {
			output = true;
		} else if (prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("no")) {
			output = false;
		}
		return output;// returns true if Y or false if N

	}

}