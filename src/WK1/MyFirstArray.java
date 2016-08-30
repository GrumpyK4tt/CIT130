package WK1;

import java.util.Scanner;

public class MyFirstArray {

	public static Scanner usr = null;
	public static String temp;
	public static String output[] = {"","","",""};
	
	public static void main(String[] args) {
		
		int counter[] = {1,4,2,5};
		usr = new Scanner(System.in);
		int i = 0;
		
		while (i < 4) {
			System.out.print("Enter a CCAC campus name: ");
			temp = usr.nextLine();
			redundancy();
			output[i] = temp;
			counter[i] = i;
			i++;
		}
		
		for (i = 0; i < 4; i++) { 
			System.out.println("At index: " + counter[i] + " Array values: " + output[i]);
		}
	}
	
	//The below will be used to ensure that the same name is not entered twice.
	
	public static void redundancy () {
		int i = 0;
		while (i < 4) {
			if (output[i].equals(temp)) {
				System.out.print("Enter a different CCAC campus name: ");
				temp = usr.nextLine();
				i = 0;
			}
			else {
				i++;
			}
		}
	}

}
