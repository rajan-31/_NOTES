import java.util.*;

public class myMap {
	public static void main(String[] args) {
		HashMap<Integer,String> myMap = new HashMap<Integer,String>();
		// TreeMap<Integer,String> myMap = new TreeMap<Integer,String>();

		HashMap<Integer,String> myMap2 = new HashMap<Integer,String>();

		myMap.put(9, "A");
		myMap.put(4, "D");
		myMap.put(3, "C");
		myMap.put(2, "B");
		myMap.putIfAbsent(3, "X");

		// myMap2.put(5, "F");
		// myMap2.put(2, "Z");

		// System.out.println(myMap.get(1));

		// System.out.println(myMap.entrySet());
		// System.out.println(myMap.keySet());

		// myMap.putAll(myMap2);

		// System.out.println(myMap.firstEntry());

		Iterator<Map.Entry<Integer, String>> itr = myMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}