
public class MainApp {
	public static void main(String[] args) {
		Person p = new Person();
		p.setFirstName("John");
		p.setLastName("D");
		Employee e1 = new Employee("","","");
		
		e1.setFirstName("Steve");
		e1.setLastName("Jobs");
//		System.out.println(p.getFullName());
//		System.out.println(e1.getFullName());
		
		Person p2 = new Employee("","","");
		
		Person[] humans = new Person[2];
		humans[0] = p;
		humans[1] = e1;
		for(int i=0;i<humans.length;i++){
			System.out.println(humans[i].getFullName());
		}
		
	}
}
