public class roshamboApp {

	public static void main(String[] args) {

		Player human1 = new HumanPlayer();// creates the human player

		Player random1 = new RandomPlayer();// creates the random player

		Player rockplayer1 = new RockPlayer();// creates the rock player

		int wins = 0;// gets incremented on a win
		int losses = 0;// gets incremented on a loss
		int ties = 0;// gets incremented on a tie

		human1.getName();// prompts for human player's name
		boolean restart = true;// initalize the restart loop

		while (restart == true) {
			String playerChoice = Validate.getPlayer2("What player do you want to play againts?\n(Random or Rock)");// checks
																													// that
																													// player
																													// 2
																													// is
																													// either
																													// rock
																													// or
																													// random
			human1.getRoshambo();// prompts for rock paper or scissors
			if (playerChoice.equalsIgnoreCase("Random")) {
				random1.getRoshambo();// gets random value from 0-2 then
										// translates into rock paper or
										// scissors
			} else {
				rockplayer1.getRoshambo();// gets rock
			}

			switch (playerChoice.toLowerCase()) {

			// case for going against a random player
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

				// case for going against rock
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

			restart = Validate.getRestart();// prompt for restarting the loop

		}

		System.out.println(human1.Name+"\n\tWins: " + wins + "\n\tLosses: " + losses + "\n\tTies: " + ties);
	}

}
