package oct4Class4;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		int first = 0, second = 1;
		int third = 0;
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid input");
		}
		else if (n == 1){
			System.out.print("\nSeries: 0");
		}
		else if (n == 2){
			System.out.print("\nSeries: 0, 1");
		}
		else{
			System.out.print("\nSeries: 0, 1");
			for (int i = 2; i < n; i++) {
				third = first + second;
				first = second;
				second = third;
				System.out.print(", " + third);
			}
		}
		sc.close();
	}

}
