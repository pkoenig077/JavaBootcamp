import java.util.Scanner;

/*
 * @author Phil K
 */
public class GradeScale {
	public static void main(String[] args) {
		// initialize variables
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		String grade = null;
		double dGrade = 0;

		while (choice.equalsIgnoreCase("y")) {
			try {
				System.out.println("Enter a numerical grade: ");
				grade = scanner.nextLine();
				dGrade = Double.parseDouble(grade);// parses the input into a
													// double
				if (dGrade > 100) {
					System.out.println("Error: Not a valid grade");// Grades
																	// over 100
																	// and below
																	// 0 are
																	// made
																	// invalid
				} else if (dGrade == 100) {
					System.out.println("Letter Grade: A+");
				} else if (dGrade >= 94) {
					System.out.println("Letter Grade: A");
				} else if (dGrade >= 90) {
					System.out.println("Letter Grade: A-");
				} else if (dGrade >= 87) {
					System.out.println("Letter Grade: B+");
				} else if (dGrade >= 84) {
					System.out.println("Letter Grade: B");
				} else if (dGrade >= 80) {
					System.out.println("Letter Grade: B-");
				} else if (dGrade >= 77) {
					System.out.println("Letter Grade: C+");
				} else if (dGrade >= 74) {
					System.out.println("Letter Grade: C");
				} else if (dGrade >= 70) {
					System.out.println("Letter Grade: C-");
				} else if (dGrade >= 67) {
					System.out.println("Letter Grade: D+");
				} else if (dGrade >= 64) {
					System.out.println("Letter Grade: D");
				} else if (dGrade >= 60) {
					System.out.println("Letter Grade: D-");
				} else if (dGrade < 0) {
					System.out.println("Error: Not a valid grade ");
				} else {
					System.out.println("Letter Grade: F");
				}

				System.out.println("Continue? (Y/N)");
				choice = scanner.nextLine();// restarts loop if Y or y are
												// input, else ends
			} catch (NumberFormatException e) {// if a non-valid input is
												// attempted this runs
				System.out.println("Error: Not a valid grade ");
				continue;
			}

		}
		System.out.println("End");
		scanner.close();
	}
}
