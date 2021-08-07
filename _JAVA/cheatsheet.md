# Collections

# List

## ArrayList
Props:

- dynamic array, no size limit
- It is like the Vector in C++
- duplicate elements allowed
- non synchronized
- manipulation is little bit slower than the LinkedList, because a lot of shifting needs to occur if any element is removed from the array list

```
ArrayList<String> list=new ArrayList<String>();
// list.size();
// list.isEmpty();

list.add("A");		// O(1)
list.add(0, "B");	// O(n)	// index, value

list.get(0);		// O(1)
list.set(0, "C");	// O(n)	// index, value

list.remove("C");	// O(n)	// by value
list.remove(0);		// O(n)	// by index
// list.removeRange(fromIndex, toIndex);
// list.clear();	// Removes all of the elements

// list.indexOf("A");	// O(n) // first occurrence of the specified element in this list, or -1
// list.lastIndexOf("A")// O(n) // last occurrence of the specified element in this list, or -1

Collections.sort(list);

// for loop
for(int i=0; i<list.size(); i++) {
	System.out.println(list[i]);
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
```

## LinkedList
Props:
- 