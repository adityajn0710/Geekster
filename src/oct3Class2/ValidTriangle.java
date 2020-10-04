package oct3Class2;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Angle 1: ");
		int ang1 = input.nextInt();
		System.out.printf("Enter Angle 2: ");
		int ang2 = input.nextInt();
		System.out.printf("Enter Angle 3: ");
		int ang3 = input.nextInt();
		
		if ((ang1 + ang2 + ang3) == 180){
			System.out.println("Valid Triangle :)");
		}
		else {
			System.out.println("Triangle invalid :( ");
		}
	}

}