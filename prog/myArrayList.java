import java.util.*;

public class myArrayList {
	public static void main(String A[]) {
		ArrayList<String> list=new ArrayList<String>();

		
		// list.size();
		// list.isEmpty();

		list.add("A");		// O(1)
		list.add(0, "B");	// O(n)	// index, value

		list.get(0);		// O(1)
		list.set(0, "C");	// O(n)	// index, value

		// list.remove("C");	// O(n)	// by value
		// list.remove(0);		// O(n)	// by index
		// list.removeRange(fromIndex, toIndex);
		// list.clear();	// Removes all of the elements

		// list.indexOf("A");	// O(n) // first occurrence of the specified element in this list, or -1
		// list.lastIndexOf("A")// O(n) // last occurrence of the specified element in this list, or -1

		Collections.sort(list);

// for loop
for(int i=0; i<list.size(); i++) {
	System.out.println(list.get(i));
}

// iterator
Iterator itr = list.iterator();
while(itr.hasNext()){	// iterator has the elements  
	System.out.println(itr.next());	//printing and move to next  
}

// for each
for(String elt: list) {
	System.out.println(elt);
}

// *java8, forEach()
list.forEach(a->{ //Here, we are using lambda expression  
    System.out.println(a);  
	});

    //   	list.add("A");
    //   	// list.add("D");
    //   	list.add("C");
    //   	list.add("B");

    //   	ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("L"));
    //   	list2.add("A");
    //   	list2.add("B");
    //   	list2.add("C");

    //   	Collections.sort(list2);
  		// System.out.println(list2);
	}
}