package Collection_Objects;

import java.util.*;

public class Queue_Test {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();//priority is by default in ascending order and in this priority is assigned to Delhi because of alphabetical order.
		// rest elements other than first or priority are added in according to their hash codes.6
		q.add("Hapur");
		q.add("Noida");
		q.add("Delhi");
		q.add("Ghaziabad");
		q.add("Meerut");
		System.out.println(q);
		
	//	q.remove();// remove first element
		//q.remove("Ghaziabad");
		
		// return the first element and removes Other ones.
		System.out.print(q.poll());

	}

}
