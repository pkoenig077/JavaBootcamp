import java.util.Scanner;

public class Validate {
	static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @return a boolean restart checks if inputted string for a yes/no prompt
	 */
	public static boolean getRestart() {
		String prompt = getInput("\nWould you like to play again?\n(Y)es/(N)o");
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
	 * @return a string that is either rock or random
	 */
	public static String getPlayer2(String prompt) {
		String input = getInput(prompt);
		while (!(input.equalsIgnoreCase("rock") || input.equalsIgnoreCase("random"))) {
			System.out.println("Error: That's not a valid player, try again");
			input = getInput(prompt);
		}

		return input;
	}
/**
 * 
 * @param prompt
 * @return string that is either rock, paper , or scissors
 */
	public static String getValidRoshambo(String prompt) {
		String input = getInput(prompt);
		while (!(input.equalsIgnoreCase("rock") || input.equalsIgnoreCase("paper")
				|| input.equalsIgnoreCase("scissors"))) {
			System.out.println("Error: invalid choice. Choose rock, paper, or scissors");
			input = getInput(prompt);
		}
		return input;
	}

}
