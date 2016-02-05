import java.util.Scanner;

/*
 * @author Phil K
 * Prompt the user to choose between options
 * Change output based on user input
 */

public class SandwichSimulator {
	static Scanner scanner = new Scanner(System.in);// Scanner method outside
													// main to return a string
	static String message;

	static String getInput(String prompt) {

		String s = scanner.nextLine();
		return s;
	}

	public static void main(String[] args) {

		// initialize variables

		String confirm = "0";
		String bread = "0";
		String meat = "0";
		String cheese = "0";
		String breadChoice = "0";
		String meatChoice = "0";
		String cheeseChoice = "0";
		boolean isValidConfirm = confirm.matches("^[yYnN]$");// regular
																// expression so
																// that confirm
																// can only be y
																// Y N or N
		boolean isValidBreadChoice = breadChoice.matches("^[123]$");// regular
																	// expression
																	// for bread
																	// choices
		boolean isValidMeatChoice = meatChoice.matches("^[1234]$");// regular
																	// expression
																	// for meat
																	// choices
		boolean isValidCheeseChoice = cheeseChoice.matches("^[123]$");// regular
																		// expression
																		// for
																		// cheese
																		// choices

		System.out.println("Welcome to Sandwich Simulator 2016! \nWould you like to order a sandwich? \n(Y/N)");
		// Y CONTINUES, N ENDS, any other input restarts
		confirm = getInput(confirm);
		while (!isValidConfirm) {
			if (confirm.equalsIgnoreCase("y")) {
				// Continues to next question

				while (!isValidBreadChoice) {// chooses bread , invalid inputs
												// restart from here
					System.out.println("What kind of bread do you want? \n1: White\n2:Wheat\n3:Multigrain \n(1/2/3)");
					breadChoice = getInput(breadChoice);

					switch (breadChoice) {
					case "1": {
						System.out.println("You've chosen white bread!");
						while (!isValidMeatChoice) {
							bread = "White Bread";
							System.out.println(
									"What kind of meat do you want?\n1:Roast Beef \n2: Ham \n3: Salami \n4: Turkey \n(1/2/3/4)");
							meatChoice = getInput(meatChoice);

							switch (meatChoice) {// chooses meat, invalid
													// choices reset to bread
													// choice selection
							case "1": {
								System.out.println("You've chosen Roast Beef!");
								while (!isValidCheeseChoice) {
									meat = "Roast Beef";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {// chooses cheese,
															// invalid inputs
															// reset to bread
															// choice
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);// exits program
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}
									}
									break;
								}
							}
								break;
							case "2": {
								System.out.println("You've chosen Ham!");
								while (!isValidCheeseChoice) {
									meat = "Ham";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}
									}
									break;
								}
							}
								break;
							case "3": {
								System.out.println("You've chosen Salami!");
								while (!isValidCheeseChoice) {
									meat = "Salami";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}
									}
									break;
								}
							}
								break;
							case "4": {
								System.out.println("You've chosen Turkey!");
								while (!isValidCheeseChoice) {
									meat = "Turkey";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}
									}
									break;
								}
							}
								break;
							default: {
								System.out.println("That's not meat, try again!");
								continue;
							}
							}
							break;
						}
					}
						break;
					case "2": {
						System.out.println("You've chosen wheat bread!");
						while (!isValidMeatChoice) {
							bread = "Wheat Bread";
							System.out.println(
									"What kind of meat do you want?\n1:Roast Beef \n2: Ham \n3: Salami \n4: Turkey \n(1/2/3/4)");
							meatChoice = getInput(meatChoice);

							switch (meatChoice) {
							case "1": {
								System.out.println("You've chosen Roast Beef!");
								while (!isValidCheeseChoice) {
									meat = "Roast Beef";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "2": {
								System.out.println("You've chosen Ham!");
								while (!isValidCheeseChoice) {
									meat = "Ham";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "3": {
								System.out.println("You've chosen Salami!");
								while (!isValidCheeseChoice) {
									meat = "Salami";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "4": {
								System.out.println("You've chosen Turkey!");
								while (!isValidCheeseChoice) {
									meat = "Turkey";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							default: {
								System.out.println("That's not meat, try again!");
								continue;
							}

							}
							break;
						}
					}
						break;
					case "3": {
						System.out.println("You've chosen multi-grain bread!");
						while (!isValidMeatChoice) {
							bread = "Multi-grain Bread";
							System.out.println(
									"What kind of meat do you want?\n1:Roast Beef \n2: Ham \n3: Salami \n4: Turkey \n(1/2/3/4)");
							meatChoice = getInput(meatChoice);

							switch (meatChoice) {
							case "1": {
								System.out.println("You've chosen Roast Beef!");
								while (!isValidCheeseChoice) {
									meat = "Roast Beef";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "2": {
								System.out.println("You've chosen Ham!");
								while (!isValidCheeseChoice) {
									meat = "Ham";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "3": {
								System.out.println("You've chosen Salami!");
								while (!isValidCheeseChoice) {
									meat = "Salami";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							case "4": {
								System.out.println("You've chosen Turkey!");
								while (!isValidCheeseChoice) {
									meat = "Turkey";
									System.out.println(
											"What kind of cheese do you want? \n1: Cheddar \n2: Swiss \n3: Provalone \n(1/2/3)");
									cheeseChoice = getInput(cheeseChoice);

									switch (cheeseChoice) {
									case "1": {
										System.out.println("You've chosen Cheddar!");
										cheese = "Cheddar Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "2": {
										System.out.println("You've chosen Swiss!");
										cheese = "Swiss Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									case "3": {
										System.out.println("You've chosen Provalone!");
										cheese = "Provalone Cheese";
										System.out.println("You ordered a sandwich with " + bread + ", " + meat
												+ " and " + cheese + "!");
										System.exit(0);
									}
										break;
									default: {
										System.out.println("That's not cheese, try again!");
										continue;
									}

									}
									break;
								}
							}
								break;
							default: {
								System.out.println("That's not meat, try again!");
								continue;
							}

							}
							break;
						}
					}
						break;

					default: {
						System.out.println("That's not bread, try again!");

					}
						break;
					}
				}
			}
			if (confirm.equalsIgnoreCase("n")) {
				// End the program
				System.out.println("Too Bad");
				System.exit(0);
			} else {
				System.out.println("Invalid Command, Try Again");
				confirm = getInput(confirm);
			}

		}
	}
}
