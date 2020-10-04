package oct3Class3;

import java.util.Scanner;

public class PrimeNumer {

	public static void main(String[] args) {
		System.out.print("Enter number to be checked: ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = false;
		for (int i = 2; i < (num/2) ; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
			
		}
		if (flag){
			System.out.println("Non Prime!");
		}
		else {
			System.out.println("Prime!");
		}
			
	}

}
