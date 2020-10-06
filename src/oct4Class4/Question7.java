package oct4Class4;

public class Question7 {

	public static void main(String[] args) {
	
		int i = 0, j = 0, k = 0;
		
//		pattern 1
		for (i=0 ; i<4 ; i++) {
			for (j=0 ; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		extra space
		System.out.println();
		
//		pattern 2
		for (i=1 ; i<6 ; i++) {
			for (j=0 ; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		extra space
		System.out.println();
		
//      pattern 3
		int n = 5;
		
		for ( i=1 ; i<n+1; i++) {
			for ( j=0 ; j<((2*n)-(2*i)) ; j++) {
				System.out.print(" ");
			}
			for ( k=0 ; k<i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		extra space
		System.out.println();
		
//      pattern 4
		for ( i=1 ; i<n+1; i++) {
			for ( j=0 ; j<((2*n)-(2*i)) ; j++) {
				System.out.print(" ");
			}
			for ( k=0 ; k<((2*i)-1) ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		extra space
		System.out.println();
		
//      pattern 5
		for ( i=1 ; i<n+1; i++) {
			for ( j=0 ; j<((2*n)-(2*i)) ; j++) {
				System.out.print(" ");
			}
			for ( k=0 ; k<((2*i)-1) ; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
//		extra space
	    System.out.println();
	    
//      pattern 6
		for ( i=1 ; i<n+1; i++) {
			for ( j=0 ; j<((2*n)-(2*i)) ; j++) {
				System.out.print(" ");
			}
			for ( k=i ; k>0 ; k--) {
				System.out.print(k);
			}
			for (int m=2; m<=i ; m++) {
				System.out.print(m);
			}
			System.out.println();
		}
	}
}
