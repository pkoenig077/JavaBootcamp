
public class SingleSpoon {
private static SingleSpoon theSpoon;
private static boolean theSpoonIsAvailable = true;

public static SingleSpoon getInstance(){
	if(!theSpoonIsAvailable){
		System.out.println("No More Spoons :(");
		return null;
	} else
	theSpoonIsAvailable = false;
	System.out.println("Made a Spoon");
	return theSpoon;
}
private SingleSpoon() {}

public static boolean getSpoonAvailable(){
	return theSpoonIsAvailable;
}

}
