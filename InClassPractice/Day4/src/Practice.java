import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test1();
		int x = 5;
		test2(x);
		int z = test3();
		System.out.println(z);
		System.out.println(test5(test3(), test4(sc), z));

	}

	public static void test1() {
		
		
	}

	public static void test2(int x) {
		System.out.println("test 2: " + x);
	}

	public static int test3() {
		return (int) ((100*Math.random())+1);

	}

	public static float test4(Scanner scan) {

		return scan.nextFloat();

	}

	public static String test5(float x, float y, float z) {
		return "Point: (" + String.valueOf(x) + ", " + String.valueOf(y) + ", " + String.valueOf(z) + ")";

	}
}
