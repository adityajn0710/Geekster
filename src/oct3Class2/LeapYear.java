package oct3Class2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.printf("Enter the year to be checked: ");
		Scanner in = new Scanner (System.in);
		int year = in.nextInt();
		if ((year % 4) == 0) {
			System.out.println("It is a Leap year. Olympics coming.");
		}
		else {
			System.out.println("No Olympics, sorry :(");
		}
			
	}

}
