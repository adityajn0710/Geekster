package oct4Class4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n for 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n : ");
		int n = sc.nextInt();
		double m = (double)n;
		double sum = 0;
		for ( m=1 ; m<=n ; m++) {
			sum+= (1/m);
		}
	
		System.out.print("\nSum of Series is: "+sum);
		sc.close();
	}

}
