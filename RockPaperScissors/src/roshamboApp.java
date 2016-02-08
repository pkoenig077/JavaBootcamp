import java.util.Scanner;

public class roshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Player human1 = new HumanPlayer();

		Player random1 = new RandomPlayer();

		Player rockplayer1 = new RockPlayer();
		
		int wins = 0;
		int losses = 0;
		int ties = 0;
		
		human1.getName();
		
		
		String playerChoice = Validate.getPlayer2("What player do you want to play againts?\n(Random or Rock)");
		boolean restart = true;
		
		while(restart==true){
		human1.getRoshambo();
		if (playerChoice.equalsIgnoreCase("Random")) {
			random1.getRoshambo();
		} else {
			rockplayer1.getRoshambo();
		}

		switch (playerChoice.toLowerCase()) {
		case "random": {
			if (human1.Roshambo == random1.Roshambo) {
				System.out.println("Tie");
				ties++;
			} else if (human1.Roshambo == RoshamboValue.rock && random1.Roshambo == RoshamboValue.paper) {
				System.out.println("Loss");
				losses++;
			} else if (human1.Roshambo == RoshamboValue.paper && random1.Roshambo == RoshamboValue.scissors) {
				System.out.println("Loss");
				losses++;
			} else if (human1.Roshambo == RoshamboValue.scissors && random1.Roshambo == RoshamboValue.rock) {
				System.out.println("Loss");
				losses++;
			} else {
				System.out.println("Win");
				wins++;
			}

			break;
		}
		case "rock": {
			if (human1.Roshambo == RoshamboValue.rock) {
				System.out.println("Tie");
				ties++;
			} else if (human1.Roshambo == RoshamboValue.paper) {
				System.out.println("Win");
				wins++;
			} else {
				System.out.println("Loss");
				losses++;
			}

			break;
		}
		}
		
		restart = Validate.getRestart();
		
		
		}
		
		System.out.println("Wins: " + wins + "\n"
				+	"Losses: " + losses + "\n"
				+	"Ties: " + ties);
	}

}
