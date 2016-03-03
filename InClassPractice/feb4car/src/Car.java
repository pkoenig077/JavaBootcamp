
public class Car {
	public Wheel[] carWheels;
	public Door[] carDoors;
	
	public Car()
	{
		carWheels = new Wheel[4];
		carDoors= new Door[4];
		for(int i=0;i<4;i++){
			carDoors[i] = new Door();
			carWheels[i]= new Wheel();
		}
	}
	
	public Car(int numWheels, int numDoors){
		carWheels = new Wheel[numWheels];
		carDoors = new Door[numDoors];
		for (int i =0;i<numWheels;i++){
			carWheels[i]= new Wheel();
		}
		for (int i=0;i<numDoors;i++){
			carDoors[i]= new Door();
		}
	}
	
}
