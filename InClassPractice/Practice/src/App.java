import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String choice = "0";
		//checks to see if y, n, Y, or N are the string choice inputted.
		Scanner sc = new Scanner(System.in);
		boolean isValidChoice = choice.matches("^[ynYN]$");
        while (!isValidChoice) {
            System.out.println("That is not a valid option.");
            System.out.print("Would you like to continue? (y/n): ");
            choice = sc.nextLine();
            isValidChoice = choice.matches("^[ynYN]$");
        }
        
        
        
        
		
		//checks to see if y, n, Y, or N are the string choice inputted.
		}
	}
