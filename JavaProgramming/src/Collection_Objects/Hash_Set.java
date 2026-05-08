package Collection_Objects;
import java.util.*;
public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("orange");
		set.add("kiwi");
		set.add("mango");
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.equals("orange"));//false only works when compariring between two set
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//System.out.println(set);
		
	
	}

}
