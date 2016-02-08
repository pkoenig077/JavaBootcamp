
public class RockPlayer extends Player {

	@Override
	public void getRoshambo() {
		Roshambo = RoshamboValue.rock;
		System.out.println("Rock");
	}

	@Override
	public void getName() {
		Name = "Rock Player";
	}

}
