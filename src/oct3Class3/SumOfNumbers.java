package oct3Class3;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("\nSum of First " + num + " numbers: " + (num * (num + 1) / 2));
	}

}
