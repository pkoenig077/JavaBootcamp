import java.util.Scanner;

/*
 * @author Phil K
 * 
 * Prompt user for a word
 * Translate the word to Pig Latin
 * Prompt for a restart
 * 
 * 
 * SPECS
 * Convert to lowercase before translating
 * If a word starts with a vowel, add way to the end
 * If a word starts with a consonant move all consonants that appear before the first vowel to the end of the word, then add ay to the end
 * Treat y as a consonant
 * Translate words with contractions
 * Check that the user has actually entered text before translating
 * Make the application take a line, and translate each word in the line
 * 
 * TODO
 * Keep the case of the word
 * Allow punctuation
 * Don't translate words with numbers or symbols
 */
public class PigLatin {
	public static Scanner scan = new Scanner(System.in);// creates a scanner
	public static String vowels = "aeiou";

	public static void main(String[] args) {// main method

		// initialize variables
		String sRestart = "";
		String translation = "";
		boolean restart = getRestart(sRestart);// prompts the user to translate
												// something
		int vowelIndex = 0;
		String input = "";
		while (restart) {
			input = getInput();
			if (input.contains(" ")) {
				String parts[] = input.split(" ");
				for (int i = 0; i < parts.length; i++) {
					vowelIndex = getIndexOfFirstVowel(parts[i]);// finds the
																// index
																// location of
																// the first
																// appearance of
																// a vowel
					if (vowelIndex == -1) {// skip translation if word contains
											// no vowels
						System.out.print(parts[i] + " ");
						
					} else {
						if (parts[i].matches("[^A-Za-z]")) {// skip
																												// translation
																												// if
																												// word
																												// contains
																												// numbers
																												// or
																												// special
																												// characters
							System.out.print(parts[i] + " ");
							

						} else {
							if (vowelIndex >= 0) {
								translation = getTranslation(vowelIndex, parts[i]);// translates
																					// the
																					// word
																					// into
																					// pig
																					// latin
								System.out.print(translation + " ");// prints
																	// the
								// translation
							}
						}
					}
				}

			} else{
				
			}
			restart = getRestart(sRestart);// prompts the user for a
			// restart}
		}
		System.out.println("Good Bye");
	}

	public static int getIndexOfFirstVowel(String word) {

		for (int index = 0; index < word.length(); index++) {
			if (vowels.contains(String.valueOf(word.charAt(index)))) {
				return index;
			}
		}

		// handle cases where a vowel is not found
		return -1;
	}

	public static String getTranslation(int index, String word) {
		String translation = "";

		if (index == 0) {
			translation = getVowelTranslation(word);// translates words that
													// start with vowels
		} else {
			translation = getConsonantTranslation(index, word);// translates
																// words that
																// start with
																// vowels
		}

		return translation;
	}

	public static String getVowelTranslation(String word) {// vowel translation
		String output = word.concat("way");
		return output;
	}

	public static String getConsonantTranslation(int index, String word) {// consonant
																			// translation
		String output;
		String part1;
		String part2;
		part1 = word.substring(0, index);// Splits the inital inputted string at
											// the location of the first vowel
		part2 = word.substring(index);
		output = part2.concat(part1.concat("ay"));// combines the split string
													// with the first vowel
													// being the first letter,
													// and the substring that
													// contains the consonants
													// after with the suffix ay
													// added on
		return output;
	}

	public static String getInput() {// prompts input from user,
										// accepts any input,
										// returns as a String
		System.out.println("Enter a line to be translated into Pig Latin");
		String prompt = scan.nextLine();
		String loweredInput = prompt.toLowerCase();// converts user input to
													// lower case

		return loweredInput;
	}

	public static String getRestartInput() {// Prompts user to restart
		System.out.println("\nWould you like to translate something?\n(Y/N)");
		String restart = scan.nextLine();
		return restart;
	}

	public static boolean getRestart(String prompt) { // prompts user for a Y,
		// N, Yes, or No input
		// using getRestartInput
		prompt = getRestartInput();
		boolean output = true;
		while (!(prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("yes")
				|| prompt.equalsIgnoreCase("no"))) {
			System.out.println("Error: Invalid Input");// when the input from
			// getRestartInput is
			// not a Y or N
			prompt = getRestartInput();// sends user back to getRestartInput to
			// resubmit input
		}
		if (prompt.equalsIgnoreCase("y") || prompt.equalsIgnoreCase("yes")) {
			output = true;
		} else if (prompt.equalsIgnoreCase("n") || prompt.equalsIgnoreCase("no")) {
			output = false;
		}
		return output;// returns true if Y or false if N. Causes the main
		// method's while loop to run on true
	}

}
