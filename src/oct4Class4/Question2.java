package oct4Class4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of inputs: ");
		int num = sc.nextInt();
		int inp = 0, largest = 0, smallest = 0;

		System.out.print("Enter number 1: ");
		inp = sc.nextInt();
		largest = inp;
		smallest = inp;
		for (int i = 1; i < num; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			inp = sc.nextInt();
			if (inp > largest) {
				largest = inp;
				continue;
			}
			if (inp < smallest) {
				smallest = inp;
			}
		}
		System.out.print("\nLargest Number: " + largest);
		System.out.print("\nSmallest Number: " + smallest);
	}

}
