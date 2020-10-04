package oct3Class3;

import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.print("Enter First number: ");
			int num1 = inp.nextInt();
			System.out.print("\nEnter Second number: ");
			int num2 = inp.nextInt();
			System.out.print("\nSum: " + (num1+num2));
			System.out.print("\nContinue(0/1): ");
			choice = inp.nextInt();
		}while(choice == 1);

	}

}
