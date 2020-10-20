package class8;

public class MaximumProduct {

	public static void main(String[] args) {
		int[] A = {2,-3,-2,4};
		System.out.println(maxProduct(A));

	}
    public static int maxProduct(int[] A) {
        int n = A.length;
        if (n==0) return 0;

        int maxi = 1, mini = 1;
        int out = Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            int oldmaxi = Math.max(maxi,1);
            if (A[i] > 0) {
                maxi = oldmaxi*A[i];
                mini *= A[i];
            } else {
                maxi = mini*A[i];
                mini = oldmaxi*A[i];
            }
            out = Math.max(out,maxi);
        }

        return out;
        
    }
}
