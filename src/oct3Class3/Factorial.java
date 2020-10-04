package oct3Class3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		
		System.out.printf("Enter a number: ");
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		int num1 = num;
		
		if (num != 0) {
			while(num1 > 1) {
				factorial= factorial * num1;
				num1-= 1;
			}
		}
		
		System.out.printf(num + "! = " + factorial);
	}

}
