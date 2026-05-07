package Collection_Objects;
import java.util.*;

public class Deque_Test {

	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<String>();
		//follow insertion order
		d.add("Hapur");
		d.add("Noida");
		d.add("Delhi");
		d.add("Ghaziabad");
		d.add("Meerut");
//		System.out.println(d);
//	System.out.println(d.offer("Shamli"));
//		System.out.println(d.getFirst());
//		System.out.println(d.getLast());
//		//System.out.println(d.contains(""));contains the string or not which is inputed
//		System.out.println(d.peek());//get first element
		//System.out.println(d.poll());//retrieve first then remove others
	//	System.out.println(d.pollLast());
		System.out.println(d.pop());
		System.out.println(d);
		
		

	}

}
