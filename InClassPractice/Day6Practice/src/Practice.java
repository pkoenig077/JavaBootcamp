import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {

	int[] elements = { 3, 7, 3, 5, 6, 8, 7, 5, 4, 3, 2, 0, 0, 1, 1, 1, 1, 7, 8, 9, 15 };
//
//		Arrays.sort(elements);
//
//		int pastValue = elements[0];
//		int counter = 0;
//
//		for (int i = 0; i < elements.length; i++) {
//			if (elements[i] != pastValue) {
//				System.out.println("element " + elements[i -1] + " is repeated " + counter + " times");
//				counter = 0;
//			}
//			counter++;
//			pastValue = elements[i];
//		}

//		 count frequency of elements inside the elements array
//		 print frequency of each element in array
		 int max = -100000;
		 for (int x : elements) {
		 if (x > max) {
		 max = x;
		 }
		 }
		 int[] freq = new int[max + 1];
		 for (int x : elements) {
		 freq[x]++;
		 }
		 for(int i=0;i<freq.length;i++){
		 System.out.println("Frequency of " + i+ " is "+ freq[i]);
		 }

		// int [] [] elements = new int [3][3];
		// int [][] elements = {{1,2,3,4},{5,6},{7,8,9,10,11}};
		// for(int i=0;i<elements.length;i++){
		// for (int j=0;j<elements[i].length;j++){
		// System.out.print(elements[i][j] + "\t" );
		// }
		// System.out.println();
		// }

	}
}