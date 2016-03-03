
public class Employee extends Person {


public String Title;
public float Salary;
public String CompanyName;

public Employee(String fName, String lName, String t){
//	setFirstName(fName);
//	setLastName(lName);
	super(fName,lName);
	Title=t;
}

@Override
public String getFullName(){
	
	return Title +" "+ getFirstName()+ " "+getLastName();
}
}
