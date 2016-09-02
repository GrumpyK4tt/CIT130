package WK2;

import java.util.Scanner;

public class MyDimensionalArray {

	public static Scanner usr = new Scanner(System.in);
	public static String tempStr;
	public static int tempInt;
	public static boolean running = true;
	
	public static void main(String[] args) {
		while (running) {
			
			String multi[][] = new String [5][5];
			multi[][] = {
					
					"Happy", "";
					"Clouds","";
					"Time","";
					"Orange","";
					"Family";"";
					
			}
			
			System.out.println("Let's play a word association game.");
			System.out.println("I'll give you a word and you provide a response.");
			
			
			tempStr = usr.next();
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
