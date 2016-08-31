package WK2;

import java.util.Scanner;

public class MyDimensionalArray {

	public static Scanner usr = new Scanner(System.in);
	public static String tempStr;
	public static int tempInt;
	public static boolean running = true;
	
	public static void main(String[] args) {
		while (running) {
			System.out.println("Let's play a word association game.");
			
		}
	}
	
	public static void errHandler() {
		
		while (true) {
			try {
				tempInt = Integer.parseInt(tempStr);
				if (tempInt > 10000) {
					System.out.println("Please choose a smaller amount of numbers to generate.");
					tempStr = usr.next();
					continue;
				} else {
					break;
				}
				
			}
			catch (NumberFormatException e) {
				
			}
			
			System.out.println("Error! " + tempStr + " is not the correct format.\n" +
								"Please enter a whole number.");
			tempStr = usr.next();
		}
	}

}
