package oct4Class4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n for 1 - 1/2 + 1/3 - 1/4 + 1/5 …………1/n : ");
		double n = sc.nextDouble();
		double sum = 1;
		
		for( int i=2 ; i<=n ; i++) {
			if (i % 2 == 0) {
				sum = sum - ((double)1/i);
			}
			else {
				sum = sum + ((double)1/i);
			}
		}
		
		System.out.println("Sum: " + sum);
		
	}

}
