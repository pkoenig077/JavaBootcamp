import java.util.Scanner;

public class Validate {
	static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @return a boolean restart checks if inputted string for a yes/no prompt
	 */
	public static boolean getRestart() {
		String prompt = getInput("\nWould you like to restart?\n(Y)es/(N)o");
		boolean restart = true;
		while (!(prompt.matches("^[YyNn]$") || prompt.equalsIgnoreCase("yes") || prompt.equalsIgnoreCase("no"))) {
			System.out.println("Error: Invalid Input");
			prompt = getInput("\nWould you like to restart?\n(Y)es/(N)o");
		}
		if (prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("yes")) {
			restart = true;
		} else if (prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("no")) {
			restart = false;
		}
		return restart;

	}

	/**
	 * 
	 * @return a string input
	 */
	private static String getInput(String prompt) {
		System.out.println(prompt);
		return sc.nextLine();
	}

	/**
	 * 
	 * @param prompt
	 * @return a string for category input
	 */
	public static String getCatInput(String prompt) {
		String catInput;
		catInput = getInput(prompt);
		while (!(catInput.equalsIgnoreCase("Animated") || catInput.equalsIgnoreCase("Comedy")
				|| catInput.equalsIgnoreCase("Drama") || catInput.equalsIgnoreCase("Horror")
				|| catInput.equalsIgnoreCase("Scifi") || catInput.equalsIgnoreCase("musical"))) {
			System.out.println("No movies of that genre, try again: ");
			catInput = getCatInput(prompt);
		}

		return catInput;
	}

}
