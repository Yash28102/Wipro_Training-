package Collection_Objects;
import java.util.*;
public class Mapping_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Orange", 1);
		map.put("Strawberry", 2);
		map.put("Guava", 3);
		map.put("Kiwi", 4);
		map.put("Banana", 5);
		map.put("Mango", 6);
		map.put(null, null);
		map.put(null, 5);
		//map.put("Orange", 7);//store last occurance of key value in console output.
		System.out.println(map);
//		System.out.println(map.containsKey("Orange"));
//		System.out.println(map.containsValue(5));
		map.replace("Kiwi",90);//replace value of that key. this is used when we dont know the previous value of that key.
//		System.out.println(map.replace("Orange", 1, 5)); replace value of that key.
		//System.out.println(map.get("Kiwi"));
		System.out.println(map);
	}

}
