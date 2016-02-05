import java.util.Scanner;

/*
 * @author Phil K
 */
public class RoomSize {
	public static void main(String[] args) {
		// initialize variables
		Scanner scanner = new Scanner(System.in);
		String choice = "y";
		double length = 0;
		double width = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		String sLength = null;
		String sWidth = null;

		while (choice.equalsIgnoreCase("y")) {
			try {
				System.out.println("Enter width (ft): ");
				sWidth = scanner.nextLine();// record width input as a string
				width = Double.parseDouble(sWidth);// parse string into double
				System.out.println("Enter length (ft): ");
				sLength = scanner.nextLine();// length as a string
				length = Double.parseDouble(sLength);// parse into a double
				area = length * width;
				perimeter = 2 * length + 2 * width;
				volume = length * width * 10;//assumes a standard room height of 10 feet
				System.out.println("Area is: " + area + " square feet\nPerimeter is: " + perimeter
						+ " feet\nVolume is: " + volume + " cubic feet");
				System.out.println("Continue? (Y/N)");
				choice = scanner.nextLine();// y or Y input restarts the
												// loop, any other input ends
			} catch (NumberFormatException e) {// catches non-double inputs for
												// width and length
				System.out.println("Error: Not a valid number ");
				continue;// restarts the loop
			}
		}
		System.out.println("End");
		scanner.close();
	}
}
