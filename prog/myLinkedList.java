import java.util.*;

public class myLinkedList {
	public static void main(String A[]) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

		list.add("A"); list.add("D"); list.add("C");
		list.add(0, "B");

		boolean x = list2.equals(list);

		System.out.println(list.getFirst());
	}
}