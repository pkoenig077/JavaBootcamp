import java.util.Scanner;
/**
 * 
 * @author Phil
 *	@Class for validating user input
 */
public class Validate {
	static Scanner sc = new Scanner(System.in);
/**
 * 
 * @return a boolean restart
 * checks if inputted string for a yes/no prompt
 */
	public static boolean getRestart() { 
		String prompt = getRestartInput();
		boolean restart = true;
		while (!(prompt.matches("^[YyNn]$") || prompt.equalsIgnoreCase("yes")
				|| prompt.equalsIgnoreCase("no"))) {
			System.out.println("Error: Invalid Input");
			prompt = getRestartInput();
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
	 * @return string restart
	 * gets a string input for the getRestart method
	 */
	private static String getRestartInput() {
		
		System.out.println("\nWould you like to restart?\n(Y)es/(N)o");
		String restart = sc.nextLine();
		return restart;
	}

	
	/**
	 * 
	 * @param Scanner
	 * @param double
	 * @return double validRadius
	 * checks if an input is a double value
	 */
	private static double getValidDouble(Scanner sc, double radius) {
		boolean isValid = false;
		radius = 0;
		while (isValid == false) {
			System.out.println("Please enter a radius: ");
			if (sc.hasNextDouble()) {
				radius = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return radius;
	}
	/**
	 * 
	 * @param Scanner
	 * @return a double within a range greater than 0
	 */
	public static double getValidDoubleRange(Scanner sc) {
		double validDouble = 0;
		boolean isValid = false;
		while (isValid == false) {
			validDouble = getValidDouble(sc, validDouble);
			if (validDouble < 0 ) {
				System.out.println("Error! Number must be greater than 0");
			}

			else {
				isValid = true;
			}
		}
		return validDouble;
	}
}
