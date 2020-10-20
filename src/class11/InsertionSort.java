package class11;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 5, -1, 10, 0, 100, 67, -47 };
		int size = array.length;

	    for (int i = 1; i < size; i++) {
	      int key = array[i];
	      int j = i - 1;

	      // Compare key with each element on the left of it until an element smaller than
	      // it is found.
	      // For descending order, change key<array[j] to key>array[j].
	      while (j >= 0 && key < array[j]) {
	        array[j + 1] = array[j];
	        --j;
	      }

	      // Place key at after the element just smaller than it.
	      array[j + 1] = key;
	    }
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
