# JAVA

## Array

```
String[] arr = new String[5];
String[] arr = {"a","b","c", "d", "e"};
String[] arr = new String[]{"a","b","c","d","e"};
int[][] arr=new int[3][3];//3 row and 3 column  

// arr.length

String[] arr = new String[arrayList.size()];
arrayList.toArray(newArr);
int newArr[]=arr.clone();   // deep copy

ArrayUtils.reverse(arr);
```

## String

```
String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  
String s=new String("Welcome");

char charAt(int index) 	//returns char value for the particular index
int length()	//returns string length
String substring(int beginIndex)	// returns substring for given begin index.
boolean contains(CharSequence s)	//returns true or false after matching the sequence of char value.
static String join(CharSequence delimiter, CharSequence... elements)	//returns a joined string.
boolean equals(Object another)	//checks the equality of string with the given object.
boolean isEmpty()	//checks if string is empty.
String concat(String str)	//concatenates the specified string.
String replace(CharSequence old, CharSequence new)	//replaces all occurrences of the specified CharSequence.
int indexOf(int ch)	//returns the specified char value index.
int indexOf(String substring)	returns the specified substring index.
String toLowerCase()
String toUpperCase()
String trim()	//removes beginning and ending spaces of this string.
```

## ArrayLIst

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

## HashMap

```
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"Mango");
map.remove(100);  

for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

for (String url : gfg.values())
            System.out.println("value: " + url);
```

## set

```
Set<String> hash_Set = new HashSet<String>();
hash_Set.add("Geeks");
hash_Set.remove("Geeks");

Set<Integer> a = new HashSet<Integer>();
a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

for (String value : hs)
		System.out.print(value + ", ");a.removeAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

```