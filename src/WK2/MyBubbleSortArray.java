package WK2;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSortArray {

	public static Scanner usr = new Scanner(System.in);
	public static String tempStr;
	public static int tempInt;
	
	
	public static void main(String[] args) {
		
		System.out.println("How many numbers would you like to generate?");
		
		tempStr = usr.nextLine();
		errHandler();
		int array[] = new int[tempInt];
		
		
		for (int i = 0; i < tempInt; i++) {
			array[i] = (int) (Math.random()*100+1);
		}
		
		Arrays.sort(array);
		
		System.out.println("You have generated the following numbers.");
		for (int i = 0; i < tempInt; i++) {
			if (i < tempInt -1) {
				System.out.print(array[i] + ", ");
			}
			else {
				System.out.print(array[i] + ".");
			}
			
		}

	}
	
	public static void errHandler() {
		
		while (true) {
			if (tempStr.length() > 0) {
				try {
					tempInt = Integer.parseInt(tempStr);
					break;
				}
				catch (NumberFormatException e) {
					
				}
			}
			System.out.println("Error! " + tempStr + " is not the correct format.\n" +
								"Please enter a whole number.");
			tempStr = usr.next();
		}
	}

}
