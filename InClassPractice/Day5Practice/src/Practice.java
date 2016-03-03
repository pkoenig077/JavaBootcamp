import java.util.Scanner;

public class Practice {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer (scan.nextLine());
		StringBuffer sb2 = new StringBuffer ("");
		String str = "";
		String str2 = "";
		str = sb.toString();
		sb2 = sb.reverse();
		str2 = sb2.toString();
		
		
		if(str.equals(str2)){
			System.out.println("works");
			System.out.println(sb);
			System.out.println(sb2);
		}else{
			System.out.println("doesnt");
		}
	}
}
