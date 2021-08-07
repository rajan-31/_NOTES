import java.util.*;

public class mySet {
	public static void main(String A[]) {
		TreeSet<Integer> mySet = new TreeSet<Integer>(Arrays.asList(1, 3, 5));

		mySet.add(4);
		mySet.add(3);
		mySet.add(8);
		mySet.add(999);
		mySet.add(456);

		mySet.descendingSet();

		// for(Integer elt: mySet)
		// 	System.out.println(elt);

		// // iterator
		// Iterator itr = mySet.iterator();
		// while(itr.hasNext()){	// iterator has the elements  
		// 	System.out.println(itr.next());	//printing and move to next  
		// }

		// // for each
		// for(Integer elt: mySet) {
		// 	System.out.println(elt);
		// }

		// // *java8, forEach()
		// mySet.forEach(a->{ //Here, we are using lambda expression  
		//     System.out.println(a);  
		// 	});

		System.out.println(mySet.getFirst())
	}
}