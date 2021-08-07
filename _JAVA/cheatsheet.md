# Collections

## List

__ArrayList__

Props:

- dynamic array, no size limit
- It is like the Vector in C++
- duplicate elements allowed
- non synchronized
- manipulation is little bit slower than the LinkedList, because a lot of shifting needs to occur if any element is removed from the array list

_IMP functions_

```java

ArrayList<String> list=new ArrayList<String>();

list.add("A");
list.add(0, "B");
list.set(0, "C");

list.get(0);

// list.size();		// int
// list.isEmpty();	// boolean

list.remove("C");
list.remove(0);

list.removeRange(fromIndex, toIndex);
list.clear();	// Removes all

// list.indexOf("A");	// first occurrence of the specified element in this list, or -1
// list.lastIndexOf("A")	// last occurrence of the specified element in this list, or -1

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

_More functions_
```java

list.clone()	// Returns a shallow copy of this ArrayList instance


```

---

__LinkedList__

Props:

- 