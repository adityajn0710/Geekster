package oct4Class4;

public class Question3 {
	public static void main(String[] args) {

		boolean isArmstrong = false;
		System.out.print("Armstrong numbers till 500 are: \n");

		for (int i = 1; i <= 500; i++) {
			isArmstrong = checkArmstrong(i);

			if (isArmstrong) {
				System.out.println(i);
			}
		}

	}

	public static boolean checkArmstrong(int a) {

		int sum = 0, rem = 0, b;
		b = a;
		while (a > 0) {
			rem = a % 10;
			a = a / 10;
			sum = sum + (rem * rem * rem);
		}

		if (sum == b) {
			return true;
		}
		else {
			return false;
		}
			
	}
}
