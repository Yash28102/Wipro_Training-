package Collection_Objects;

import java.util.*;
//follow order
//index based
//null allowed
//duplicates allowed
public class Collection_Practice {
	public static void main(String[] args) {
		//List<String> list=new ArrayList<String>();
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(50);
		list.add(80);
		//list.add(); list is of string type i.e; it is showing error.
		System.out.println(list);
		//list.remove((Integer)13);// remove element using object
		//list.remove(2);// used to remove element at particular index,it will throw an exception when index accessing out of bound.
		//list.set(2, 10);adding element at particular index.
		//System.out.println(list.get(2));
		//System.out.println(list.lastIndexOf(null));print index of last null
		
		ListIterator<Integer> it=list.listIterator();
		Iterator<Integer>itr=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		//System.out.println(list);
		
	}

}
