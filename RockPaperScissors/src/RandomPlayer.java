import java.util.Random;

public class RandomPlayer extends Player {
	Random randomGen = new Random();

	@Override
	public void getRoshambo() {
		if (randomGen.nextInt(3) == 0) {
			Roshambo = RoshamboValue.rock;
			System.out.println("Rock");
		} else if (randomGen.nextInt(3) == 1) {
			Roshambo = RoshamboValue.paper;
			System.out.println("Paper");
		} else {
			Roshambo = RoshamboValue.scissors;
			System.out.println("Scissors");
		}
	}

	@Override
	public void getName() {
		Name = "Random Player";
	}

}
