import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner scan = new Scanner(System.in);

	@Override
	public void getRoshambo() {

		Roshambo = RoshamboValue.valueOf(Validate.getValidRoshambo("Enter rock, paper, or scissors: "));

	}

	public void getName() {
		System.out.println("Enter your name:  ");
		Name = scan.nextLine();

	}

}
