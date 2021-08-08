import java.util.*;

public class myArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 3, 4, 5, 6};

		int n1 = arr.length;

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		int[] arr3 = arr.clone();

		arr[0] = 9;

		// ArrayUtils.reverse(arr);

		// for(char c: arr) System.out.println(c);

		int[] arr4 = Arrays.copyOfRange(arr, 1, 3);

		for(int e: arr4) System.out.println(e);

		System.out.println(Arrays.toString(arr));
	}
}