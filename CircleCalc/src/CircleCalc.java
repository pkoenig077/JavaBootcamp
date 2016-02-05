import java.util.Scanner;

/**
 * 
 * @author Phil
 * prompts user to enter a radius
 * 
 * displays an error when user enters invalid data
 * when the user enters valid data calculate area and circumference rounded to 2 decimal places
 * prompt user to continue
 * 
 * SPECS:
 * use a separate class for user input and validation
 */
public class CircleCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean restart = true;
		double validRadius = 0;
		
	while(restart == true){
			validRadius = Validate.getValidDoubleRange(sc);
			
			Circle circle = new Circle(validRadius);
			
			System.out.println("Area of a circle with radius "+validRadius+ ": "+circle.getFormattedArea());
			System.out.println("Circumference of a circle with radius "+validRadius+": "+circle.getFormattedCircumference());
			
			
			restart = Validate.getRestart();
		}
		System.out.println("You found area and circumference of "+Circle.getCounter()+" circle(s)");
		System.out.println("Good Bye");
		sc.close();
		
	}
}
