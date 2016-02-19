
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			System.out.println(fizzBuzz(i));
		}

	}
	
	static String fizzBuzz(int input){
		String output = "";
		if(input%3 == 0)
			output += "Fizz";
		if(input%5 == 0)
			output+= "Buzz";
		if(output.equals(""))
			output = Integer.toString(input);
		return output;
	}
	

}
