package oct4Class4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of inputs: ");
		int num = sc.nextInt();
		int inp = 0, pos = 0, neg = 0, zero = 0;
		
		for(int i=0 ; i<num ; i++ ) {
			System.out.print("Enter number " + (i+1) + ": ");
			inp = sc.nextInt();
			if (inp < 0) {
				neg++;
			}
			else if (inp > 0) {
				pos++;
			}
			else {
				zero++;
			}
		}
		System.out.print("\nPositive numbers: " + pos);
		System.out.print("\nNegative numbers: " + neg);
		System.out.print("\nZeros: " + zero);
	}

}
