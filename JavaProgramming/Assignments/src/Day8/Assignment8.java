package Day8;
import java.util.*;
public class Assignment8 {

	public static void main(String[] args) {
		

		class Book {
		    String title;

		    Book(String title){
		        this.title = title;
		    }

		    public String toString(){
		        return title;
		    }
		}


		        // 1. First Non-Repeating Character
		        String str = "aabbcdde";

		        HashMap<Character,Integer> map = new HashMap<>();

		        for(char c : str.toCharArray()){
		            map.put(c, map.getOrDefault(c,0)+1);
		        }

		        for(char c : str.toCharArray()){
		            if(map.get(c) == 1){
		                System.out.println("1. First Non-Repeating: " + c);
		                break;
		            }
		        }

		        // Output:
		        // 1. First Non-Repeating: c



		        // 2. Online Shopping Cart
		        Map<String,Integer> productPrice = new HashMap<>();
		        productPrice.put("Laptop",50000);
		        productPrice.put("Mouse",500);
		        productPrice.put("Keyboard",1500);

		        List<String> cart = new ArrayList<>();
		        cart.add("Laptop");
		        cart.add("Mouse");

		        int total = 0;
		        for(String item : cart){
		            total += productPrice.get(item);
		        }

		        System.out.println("2. Cart: " + cart);
		        System.out.println("2. Total Price: " + total);

		        // Output:
		        // 2. Cart: [Laptop, Mouse]
		        // 2. Total Price: 50500



		        // 3. Library Management
		        Map<Book, Boolean> library = new HashMap<>();

		        Book b1 = new Book("Java");
		        Book b2 = new Book("Python");
		        Book b3 = new Book("C++");

		        library.put(b1, true);
		        library.put(b2, false);
		        library.put(b3, true);

		        for(Map.Entry<Book,Boolean> entry : library.entrySet()){
		            System.out.println("3. " + entry.getKey() + " Available: " + entry.getValue());
		        }

		        // Output:
		        // 3. Java Available: true
		        // 3. Python Available: false
		        // 3. C++ Available: true

		    
	}

}
