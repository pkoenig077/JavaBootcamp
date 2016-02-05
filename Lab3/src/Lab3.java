import java.util.Scanner;

/*
 * @author Phil K
 * 
 * prompt an integer input
 * display a table of the squares and cubes from 1 to the value entered
 * prompt the user to continue
 */

public class Lab3 {

	static Scanner scan = new Scanner(System.in);// Scanner method outside
													// main to return a string
	static String message;

	static String getInput(String prompt) {

		String s = scan.nextLine();
		return s;
	}

	public static void main(String[] args) {
		// initialize variables
		String choice = "y";
		String strUserInputInteger = "0";
		int userInputInteger;
		double dSquare = 0;
		double dCube = 0;
		int square = 0;
		int cube = 0;
		boolean isValidConfirm = choice.matches("^[yYnN]$");//

		while (isValidConfirm) {
			try {
				System.out.println("Learn your squares and cubes!\n");
				System.out.print("Enter an integer: ");
				strUserInputInteger = getInput(strUserInputInteger);
				userInputInteger = Integer.parseInt(strUserInputInteger);
				System.out.println("\n");
				System.out.println("Number\tSquared\tCubed\n======\t======\t======");//Makes spaced columns using the tab character
				for(int i=1; i<=userInputInteger;i++){
					double dI = i;
					dSquare = Math.pow(dI, 2);
					dCube = Math.pow(dI, 3);
					square = (int)dSquare;
					cube = (int)dCube;
					System.out.println(i + "\t" + square + "\t" + cube);
				}
				
				System.out.println("Continue? (Y/N)");
				choice = getInput(choice);
				isValidConfirm = choice.matches("^[yYnN]$");

				while (!isValidConfirm) {
					System.out.println("Unknown Command, please re-enter");
					choice = getInput(choice);
					isValidConfirm = choice.matches("^[yYnN]$");
				}
				if (choice.equalsIgnoreCase("y")) {
					continue;//restarts from integer input
				} else {
					System.out.println("Good Bye");
					break;//ends program
				}
			} catch (NumberFormatException e) {// catches non-double inputs for
												// width and length
				System.out.println("Error: Not a valid number ");
				continue;// restarts the loop
			}
		}
	}
}