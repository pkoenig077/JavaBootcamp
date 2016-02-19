import java.util.ArrayList;

public class PrimeFactor {

	
	public static ArrayList<Integer> getPrimeFactors(int input){
		ArrayList<Integer> pf =new ArrayList<>();
		int prime = 2;
		while(input>1){
			while(input%prime==0){
				pf.add(prime);
				input/=prime;
			}
			prime++;
		}
		return pf;
	}
}
