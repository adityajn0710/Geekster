package oct3Class2;

import java.util.Scanner;

public class GradeMeaning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter Grade: ");
		char gd = in.next().charAt(0);
		gd = Character.toUpperCase(gd);
		
		switch (gd) {
		case 'A' : System.out.println("Excellent!");
		break;
		case 'B' : System.out.println("Good. Keep it up.");
		break;
		case 'C' : System.out.println("Average. Need to improve");
		break;
		case 'D' : System.out.println("Deficient, Very Bad!");
		break;
		case 'F' : System.out.println("You Failed. Go home.");
		break;
		default : System.out.println("Wrong Grade. Bye");
		}
	}
}
