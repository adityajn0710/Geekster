package oct4Class4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x for 1 - x^2/2! + x^4/4! .......:");
		double x = sc.nextDouble();
		x = Math.toRadians(x); 
		System.out.print("\nEnter n for 1 - x^2/2! + x^4/4! .... x^n/n! :");
		int n = sc.nextInt();
		
		double sum = 1;
		double sum1 = sum;
		
		if (x == 0 || n == 0 ) {
			System.out.print("\nsin x = " + sum);
		}
		else if (x < 0 || n % 2 != 0 || n < 0) {
			System.out.print("\nInvalid Inputs.");
		}
			
		else {
			for (int i = 0; i<n ; ) {
				sum1 = (-1 * sum1 * x * x)/(++i * ++i);
				sum = sum + sum1;
			}
			System.out.print("\ncos x = " + sum + "    " + Math.cos(x));
		}
	}
}
