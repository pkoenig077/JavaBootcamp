package practice3;

import java.util.ArrayList;

public class ShapeApp {

	public static void main(String[] args) {
		
		ArrayList <testThing> myShapes = new ArrayList <>();
		
		myShapes.add(new circle());
		myShapes.add(new Triangle());
		
		for (testThing p: myShapes)
			p.Draw();
	}

}
