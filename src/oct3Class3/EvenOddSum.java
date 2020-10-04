package oct3Class3;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		
		System.out.printf("Enter number of inputs: ");
		
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		
		int sumOdd = 0, sumEven = 0, num = 0;
		System.out.printf("\nEnter inputs one at a time: ");
		
		for (int i = 0; i < inp; ++i ) {
			num = sc.nextInt();
			if ((num % 2) == 0) {
				sumEven+= num;
			}
			else {
				sumOdd+= num;
			}
		}	
		
		System.out.printf("\nSum of odd numbers: " + sumOdd);
		System.out.printf("\nSum of even numbers: " + sumEven);
	}
}
