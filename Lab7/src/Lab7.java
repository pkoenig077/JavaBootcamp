import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * @author Phil K
 * 
 * Provide info about students
 * prompt user to ask about a particular student
 * give proper responses
 * ask if user wants to learn about another student
 * 
 * SPECS
 * account for invalid user input using exceptions
 */
public class Lab7 {
	public static Scanner scan = new Scanner(System.in);// creates a scanner
	public static String[] studentName = { "name1", "name2", "name3", "name4", "name5", "name6" };// array
																									// of
																									// student
																									// names
	public static String[] homeTown = { "aTown", "aTown", "bTown", "cTown", "bTown", "bTown" };// array
																								// of
																								// town
																								// names.
																								// array
																								// index
																								// locations
																								// match
																								// student
																								// index
																								// locations

	public static String[] age = { "25", "25", "30", "30", "30", "32" };// array
																		// of
																		// ages
																		// index
																		// locations
																		// match
																		// student
																		// array
																		// locations

	public static void main(String[] args) {
		String sReset = "";
		String input = "";
		boolean reset = getRestart(sReset);

		while (reset) {
			System.out.println("What would you like to look up?\nStudents \nHometowns\nAges");
			input = getInput();

			if (input.matches("students?")) {
				getStudents();

			} else if (input.matches("ages?")) {

				getAge();

			} else if (input.matches("home ?towns?")) {
				getTown();

			} else {
				System.out.println("Invalid Input: Please enter students, hometowns, or ages");
				continue;
			}

			reset = getRestart(sReset);
		}
		System.out.println("End");
	}

	public static void getStudentTown() {// outputs student names for students
											// that are from the inputted town
											// name
		String prompt = getInput();
		for (int i = 0; i < homeTown.length; i++) {
			if (prompt.equalsIgnoreCase(homeTown[i])) {

				System.out.println(studentName[i]);

			} else {
				
			}
		}

	}

	public static void getStudentAge() {
		String prompt = getInput();
		for (int i = 0; i < age.length; i++) {
			if (prompt.equalsIgnoreCase(age[i])) {

				System.out.println(studentName[i]);

			} else {
				
			}
		}
	}

	public static void getStudents() {
		int studentIndex = 0;
		System.out.println("Students are: ");
		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]);// prints student names from the
												// array studentName
		}
		try {
			studentIndex = getStudentIndex();// asks what student the user wants
												// to look up
			System.out.println(studentName[studentIndex] + " is " + age[studentIndex] + " years old from "
					+ homeTown[studentIndex]);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Invalid Student Name");// when an invalid
																// name is input
																// this
																// exception is
																// caught
		}

	}

	public static int getStudentIndex() {
		/*
		 * prompts for a student name returns the index location of the named
		 * student if it exists
		 */
		String prompt = "";
		System.out.println("What student would you like to look up?");

		prompt = getInput();
		for (int i = 0; i < studentName.length; i++) {
			if (studentName[i].equalsIgnoreCase(prompt)) {
				return i;// returns the index of the student name input
			}
		}
		return -1;// if invalid student name is input

	}

	public static void getAge() {
		// prints the number of occurrences of each age in the age array
		System.out.println("Student Ages:");
		Arrays.stream(age).collect(Collectors.groupingBy(s -> s))

				.forEach((k, v) -> System.out.println(v.size() + " student(s) who are " + k));

		System.out.println("What age students would you like to look up?");
		getStudentAge();
	}

	public static void getTown() {
		// prints the number of occurrences of each hometown in the homeTown
		// array
		System.out.println("Students' hometowns are: ");
		Arrays.stream(homeTown).collect(Collectors.groupingBy(s -> s))

				.forEach((k, v) -> System.out.println(v.size() + " students from " + k));
		System.out.println("What town would you like to look up students from?");
		getStudentTown();

	}

	public static String getInput() {// prompts input from user,
		// accepts any input,
		// returns as a String
		String prompt = "";

		prompt = scan.nextLine().toLowerCase();

		return prompt;
	}

	public static String getRestartInput() {// Prompts user to restart
		System.out.println("\nWould you like to look something up?\n(Y)es/(N)o");
		String restart = scan.nextLine();
		return restart;
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
}
