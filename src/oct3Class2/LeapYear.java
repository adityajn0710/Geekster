package oct3Class2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.printf("Enter the year to be checked: ");
		Scanner in = new Scanner (System.in);
		int year = in.nextInt();
		
		if (year < 1582) {
			System.out.print("\nEnter year greater than 1582");
		}		
		else if (year % 4 == 0) {
			if ((year % 100 == 0) && (year % 400 != 0)){
				System.out.println("No Olympics, sorry :(");
			}
			else {
			System.out.println("It is a Leap year. Olympics coming.");
			}
		}
		else {
			System.out.println("No Olympics, sorry :(");
		}
		in.close();
			
	}

}
