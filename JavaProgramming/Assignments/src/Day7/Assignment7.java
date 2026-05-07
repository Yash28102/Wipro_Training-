package Day7;
import java.util.*;
public class Assignment7 {

	public static void main(String[] args) {

		        // 1. Second Largest Element
		        List<Integer> list = Arrays.asList(10, 20, 5, 30, 25);

		        Collections.sort(list);
		        int secondLargest = list.get(list.size()-2);

		        System.out.println("1. Second Largest: " + secondLargest);

		        // Output:
		        // 1. Second Largest: 25



		        // 2. Common Elements (Intersection)
		        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));

		        HashSet<Integer> intersection = new HashSet<>(set1);
		        intersection.retainAll(set2);

		        System.out.println("2. Intersection: " + intersection);

		        // Output:
		        // 2. Intersection: [3, 4, 5]



		        // 3. Symmetric Difference
		        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
		        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5,6));

		        HashSet<Integer> union = new HashSet<>(s1);
		        union.addAll(s2);

		        HashSet<Integer> common = new HashSet<>(s1);
		        common.retainAll(s2);

		        union.removeAll(common);

		        System.out.println("3. Symmetric Difference: " + union);

		        // Output:
		        // 3. Symmetric Difference: [1, 2, 5, 6]

		    }
	

	}

