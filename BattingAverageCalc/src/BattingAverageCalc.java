import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Phil K
 * 
 * Calculates batting average and slugging percentage for one or more baseball players
 * for each player, asks for number of at bats, for each at bat, ask for a result
 * for at-bat result, enter bases earned (0-4)
 * After all at bats are entered, display batting average and slugging percentage of the batter. 
 * 
 * SPECS
 * use an array to store results for each player
 * validate input so the user can only enter positive integers for at-bat results user can only enter 0-4
 * Format batting average and slugging percent so that 3 decimal places are displayed
 * 
 * Batting average is sum of at-bats where bases >0 divided by total at-bats
 * Slugging percent is sum of bases earned divided by total at-bats
 * 
 * Extended challenge
 * 
 * prompt user for number of batters
 * save batter stats in a 2d array
 * after all batters are entered, display a one line summary for each batter
 * instead of storing an array of integers, create a class named AtBat and store instances of this class in the array
 * AtBat should define an enumeration named Result with members OUT, SINGLE, DOUBLE, TRIPLE, and HOMERUN
 * Class should have a constructor that accepts a Result parameter and a method named basesEarned that returns an int representing the number of bases earned
 */
public class BattingAverageCalc {
	public static DecimalFormat df = new DecimalFormat("0.000");// Decimal
																// format to
																// show doubles
																// to 3 decimals

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int batters = 0;// must be >=0
		int atBats = 0;// must be >=0
		int basesEarnedSum = 0;
		
		batters = getBattersWithinRange(sc);// gets number of batters, must be
											// positive int
		int[][] stats = new int[batters][];
		double[][] results = new double[batters][2];

		for (int row = 0; row < batters; row++) {
			atBats = getNumAtBats(sc);// gets number of at bats for the batter,
										// must be postitve int
			int batCount = 0;

			stats[row] = new int[atBats];
			for (int col = 0; col < atBats; col++) {
				stats[row][col] = getBasesEarnedWithinRange(sc);// gets the
																// bases earned
																// for the
																// at-bat, must
																// be a positive
																// int between
																// 0-4
				if (stats[row][col] > 0) {
					batCount++;// at bats that earned bases
					basesEarnedSum += stats[row][col];
				}
				results[row][0]=  getBattingAverage(batCount, atBats);//pushes batting average to results array at [batter][0]
				results[row][1]= getSluggingPercentage(atBats, basesEarnedSum);//pushes slugging percentage to results array at [batter][1]

			}
			

			
		}
		//prints out stats for each batter
		for (int batterNum =0;batterNum<batters;batterNum++){
			int batter = batterNum+1;
		System.out.println("Batter "+batter+":\n" + "\tBatting Avg: "+ df.format(results[batterNum][0])+ "\tSlugging %: " + df.format(results[batterNum][1]) +"\n");
		}
	}
	
	
	public static int getValidBatterResults(Scanner sc, int batters) {
	//Verifies that input batter number is valid
				// returns number of batter input
		//unused
				boolean isValid = false;
				int batterNum = 0;
				while (isValid == false) {
					batterNum= getBatterResults(sc, batterNum);
					if (batterNum < 0 && batterNum >batters) {
						System.out.println("Error! Batter Number is out of range");
					} else {
						isValid = true;
					}
				}
				return batterNum;
		
	}


	public static int getBatterResults(Scanner sc, int batters) {
		// Prints batter results for desired batter number
		//unused
		int batterNum= 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("What batter would you like stats for?");
			if (sc.hasNextInt()) {
				batterNum = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		batterNum = batterNum--;
		return batterNum;
	}





	public static int getBatters(Scanner sc) {
		// prompts the user to input number of batters
		// checks that the input is an int
		int batters = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number of batters");
			if (sc.hasNextInt()) {
				batters = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return batters;
	}

	public static int getBattersWithinRange(Scanner sc) {
		// checks that the number of batters is at least 0
		// returns number of batters
		int batters = 0;
		boolean isValid = false;
		while (isValid == false) {
			batters = getBatters(sc);
			if (batters < 0) {
				System.out.println("Error! Number must be at least " + 0);
			} else {
				isValid = true;
			}
		}
		return batters;
	}

	public static int getNumAtBats(Scanner sc) {
		// checks that the number of at bats is more than 0
		// returns number of at bats
		int atBats = 0;
		boolean isValid = false;
		while (isValid == false) {
			atBats = getAtBats(sc);
			if (atBats < 0)
				System.out.println("Error! Number must be greater than " + 0);
			else
				isValid = true;
		}
		return atBats;
	}

	public static int getAtBats(Scanner sc) {
		// prompts user to input number of at bats for a batter
		// checks that input is an int
		int atBats = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number of at bats");
			if (sc.hasNextInt()) {
				atBats = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return atBats;
	}

	public static double getBattingAverage(int batCount, int atBats) {
		//calculates batting average
		double dbatCount = batCount;
		double datBats = atBats;
		double battingAverage = dbatCount / datBats;

		return battingAverage;

	}

	public static double getSluggingPercentage(int atBats, int basesEarnedSum) {
		// calculates the slugging percentage by dividing the sum of earned
		// bases by the number of at bats

		double datBats = atBats;
		double dbasesEarnedSum = basesEarnedSum;
		double slugCent = dbasesEarnedSum / datBats;
		

		return slugCent;

	}

	public static int getBasesEarned(Scanner sc) {
		// prompts user for bases earned
		// checks that input is an int
		int basesEarned = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.println("Enter number of bases earned");
			if (sc.hasNextInt()) {
				basesEarned = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid input. Try again.");
			}
			sc.nextLine();
		}
		return basesEarned;
	}

	public static int getBasesEarnedWithinRange(Scanner sc) {
		// checks that bases earned is a value from 0 to 4
		// returns number of bases earned
		int basesEarned = 0;
		boolean isValid = false;
		while (isValid == false) {
			basesEarned = getBasesEarned(sc);
			if (basesEarned < 0 || basesEarned > 4) {
				System.out.println("Error! Number must be between 0 and 4");
			}

			else {
				isValid = true;
			}
		}
		return basesEarned;
	}

}