
/*
 * Prompts a numeric input and outputs the reverse using a while loop to find the number's reverse
 * Something similar could have been made by turning the number input into a String but would have
 * had inputs like 0001 output as 1000 or inputs such as -1234 output as 4321-
 */
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int number;
		int reverse = 0;//reverse requires an inital value due to the while loop in order to avoid dividing by 0

		System.out.println("Enter an integer to be reversed");
		Scanner input = new Scanner(System.in);//creates a scanner to record keyboard input
		number = input.nextInt();

		while(number !=0)
			/* Performs the loop when the reverse isn't 0
			 * This prevents dividing by 0 as well as stops the loop once it has found the solution
			 */ 
		{
			reverse = reverse * 10;
			reverse = reverse + number%10;
			number = number/10;
		}
		System.out.println(reverse);
	}
}
