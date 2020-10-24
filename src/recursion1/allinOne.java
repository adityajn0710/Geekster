package recursion1;

public class allinOne {
	public static void main(String[] args) {
		printIncreasing(5);
		printDecreasing(5);
		printIncreasingDecreasing(7);

		long fact = factorial(20);
		System.out.println(fact);

		long power = power(2, 4);
		System.out.println(power);

		int term = fibo(20);
		System.out.println(term);

	}

	public static int fibo(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}

		int term = fibo(n - 1) + fibo(n - 2);
		return term;

	}

	public static void printDecreasing(int num) {
		System.out.println(num);
		if (num == 1) {
			return;
		}
		printDecreasing(num - 1);
	}

	public static void printIncreasing(int num) {
		if (num == 0) {
			return;
		}
		printIncreasing(num - 1);
		System.out.println(num);

	}

	public static long factorial(int num) {
		if (num == 1) {
			return 1;
		}
		long fact = num * factorial(num - 1);
		return fact;

	}

	public static long power(int num, int pow) {
		if (pow == 1) {
			return num;
		}
		long ans = power(num, pow / 2);
		if (pow % 2 == 0) {
			return ans * ans;
		} else {
			return ans * ans * num;
		}

	}

	public static void printIncreasingDecreasing(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 != 0) {

			System.out.println("Hi " + num);
		}
		printIncreasingDecreasing(num - 1);
		if (num % 2 == 0) {
			System.out.println("Bye " + num);
		}

	}
}
