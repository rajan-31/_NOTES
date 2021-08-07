import java.util.*;

public class myQ {
	public static void main(String[] args) {
		Queue<Integer> myQ= new LinkedList<>();

		myQ.add(ClassName ob); // adds ob to the queue , returns true if successful
		myQ.element(); //retrieves but does not remove the first element in the queue , throws an exception if queue is empty
		myQ.remove(); //returns and removes the head of the queue, throws an exception if queue is empty
		myQ.isEmpty();//returns true if the queue is empty , false otherwise
		myQ.size(); //returns the current size of the queue as an int

	}
}