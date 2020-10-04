package oct3Class2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter Subject 1 Marks: ");
		int mark1 = in.nextInt();
		System.out.printf("Enter Subject 2 Marks: ");
		int mark2 = in.nextInt();
		System.out.printf("Enter Subject 3 Marks: ");
		int mark3 = in.nextInt();
		
		double avgMark = ((double)mark1 + mark2 + mark3)/3;
				  
		if (avgMark >= 90) {
			System.out.println("Student acheived an A.");
		}
		else if((avgMark >= 80) && (avgMark < 90)){
			System.out.println("Student acheived an B.");			
		}
		else if((avgMark >= 70) && (avgMark < 80)){
			System.out.println("Student acheived an C.");
		}	
		else if((avgMark >= 60) && (avgMark < 70)){
			System.out.println("Student acheived an D.");
		}	
		else {
			System.out.println("What the F!.");
		}
	}

}

