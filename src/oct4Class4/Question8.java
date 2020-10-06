package oct4Class4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x for x - x^3/3! + x^5/5! - x^7/7! + x^n/n! .......:");
		double x = sc.nextDouble();
		x = Math.toRadians(x); 
		System.out.print("\nEnter n for x - x^3/3! + x^5/5! - x^7/7! + x^n/n! .......:");
		int n = sc.nextInt();
		
		double sum = x;
		double sum1 = sum;
		
		if (x == 0 || n == 0 ) {
			System.out.print("\nsin x = " + x);
		}
		else if (x < 0 || n % 2 == 0 || n < 0) {
			System.out.print("\nInvalid Inputs.");
		}
			
		else {
			for (int i = 1; i<n ; ) {
				sum1 = (-1 * sum1 * x * x)/(++i * ++i);
				sum = sum + sum1;
			}
			System.out.print("\nsin x = " + sum);
		}
	}

}
