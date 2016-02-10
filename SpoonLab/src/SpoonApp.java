
public class SpoonApp {

	public static void main(String[] args) {
		int spoonCount = 0;
		
		while(SingleSpoon.getSpoonAvailable()==true){
		spoonCount++;
		SingleSpoon spoon = SingleSpoon.getInstance();
		SingleSpoon spoon2 = SingleSpoon.getInstance();
		}
		System.out.println(spoonCount + " spoons");
	}

}
