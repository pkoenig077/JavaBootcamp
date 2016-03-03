import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// create a 2d array that stores double values. both parts of array have
		// same length
		// need a number to track array size
		// need to fill array
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		double avg1 = 0;
		int sum = 0;
		int sum1 = 0;
		int size = getValidSize(sc);

		int[][] numbers = new int[size][size];

		for (int row = 0; row < size; row++) {
			System.out.println("row " + (row + 1));
			for (int col = 0; col < size; col++) {
				System.out.println("col " + (col + 1));
				numbers[row][col] = getInt(sc);
			}
		}
		for (int row = 0; row < size; row++) {

					sum += numbers[row][row];
					sum1 += numbers[row][(size - 1) - row];
		}
				avg = (double) sum / size;
				avg1 = (double) sum1 / size;
		
		System.out.println("Average of diagonal 1 is: " + avg);
		System.out.println("Average of diagonal 2 is: " + avg1);

	}

	public static int getValidSize(Scanner sc) {
		int size = 0;
		boolean isValid = false;
		while (isValid == false) {
			size = getInt(sc);
			if (size <= 0)
				System.out.println("Error! Number must be greater than " + 0);
			else
				isValid = true;
		}
		return size;
	}

	public static int getInt(Scanner sc) {
		int validInt = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number");
			if (sc.hasNextInt()) {
				validInt = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return validInt;
	}

}
// Linked Lists are faster for adding elements
// array list is faster for searching
// Maps for fast searching
// int[] elements = { 3, 7, 3, 5, 6, 8, 7, 5, 3, 2, 1, 0, 0, 1, 1, 1, 1, 7, 8,
// 9, 15, -1, -5, -5, -5, -1 };
// HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
// for (int x : elements) { // put elements array into hashmap as keys
// countMap.put(x, 0);
// }
// for (int x : elements) { // counts elements into hashmap
// countMap.put(x, (countMap.get(x) + 1));
// }
// for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) { // prints
// // hashmap
// Integer key = entry.getKey();
// Integer value = entry.getValue();
// System.out.println("key: " + key + ", value: " + value);
// }
// LinkedList<Integer> list = new LinkedList<>();
// list.add(1);
// list.add(2);
// System.out.println(list.get(1));
// ArrayList <Integer> list1 = new ArrayList<>();
// list1.add(10);
// list1.add(20);
// System.out.println(list1.get(0));
//
//

// int [] ar = new int[10];
//
// ar = expand(ar);
// ar = expand(ar);
// System.out.println(ar.length);
//
//
// }
//
// public static int[] expand(int[] ar) {
// int [] temp = new int [ar.length*2];
// for(int x=0;x<ar.length;x++){
// temp[x]= ar[x];
// }
// ar = temp;
// return ar;
