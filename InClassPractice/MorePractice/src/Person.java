
public class Person {
private String SSN, FirstName, LastName;

public Person(){
	this("","");
}
public Person(String fName, String lName){
	FirstName = fName;
	LastName = lName;
}

public String getFullName(){
	return getLastName()+ ", " + getFirstName();
}
/**
 * @return the sSN
 */
public String getSSN() {
	return SSN;
}

/**
 * @param sSN the sSN to set
 */
public void setSSN(String sSN) {
	SSN = sSN;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return FirstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	FirstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return LastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	LastName = lastName;
}

}
