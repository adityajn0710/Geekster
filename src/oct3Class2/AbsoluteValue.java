
package oct3Class2;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter your number: ");
		int abs = in.nextInt();
		
		System.out.println("Absolute Value: " + Math.abs(abs));
	}

}