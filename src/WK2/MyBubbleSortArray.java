package WK2;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSortArray {

	public static Scanner usr = new Scanner(System.in);
	public static String tempStr;
	public static int tempInt;
	public static boolean running = true;
	
	
	public static void main(String[] args) {
		while (running) {	
			
			System.out.println("How many numbers would you like to generate?");
			
			tempStr = usr.next();
			errHandler();
			int array[] = new int[tempInt];
			
			
			for (int i = 0; i < tempInt; i++) {
				array[i] = (int) (Math.random()*100+1);
			}
			/*
			
			Easy mode
			
			Arrays.sort(array);
			
			*/
			
			//Bubble mode
			
			int temp;
			
			for (int i = 0; i < tempInt; i++) {
				for (int j = 0; j < tempInt-1; j++) {
					
					if (array[j]>array[j+1]){
						temp = array[j+1];
						array[j+1] = array[j];
						array[j] = temp;
					}
				}
			}
			
			System.out.println("You have generated the following numbers.");
			for (int i = 0; i < tempInt; i++) {
				if (i < tempInt -1) {
					System.out.print(array[i] + ", ");
				}
				else {
					System.out.print(array[i] + ". \n\n");
				}
				
			}
			
			System.out.println("Would you like to generate a new set of numbers?");
			System.out.println("1 - Yes");
			System.out.println("2 - No");
			
			tempStr = usr.next();
			errHandler();
			
			if (tempInt == 2) {
				running = false;
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
