package Collection_Objects;

import java.util.Arrays;
import java.util.List;

interface Calculator{
	int ope(int a, int b);
}

public class Lambda_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list=Arrays.asList("Hello","Welcome","Learners");
//		list.forEach(item->System.out.println(item));
		
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		Calculator div=(a,b)->a/b;
		System.out.println("Addition : "+add.ope(10, 20));
		System.out.println("Subtraction : "+add.ope(20, 100));
		System.out.println("Mutiplication : "+add.ope(10, 20));
		System.out.println("Division : " +add.ope(60, 20));
		

	}

}
