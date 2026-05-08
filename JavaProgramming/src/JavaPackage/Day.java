package JavaPackage;

import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number :");
		int day=sc.nextInt();
		// Using Switch case
		switch(day) {
		
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Invalid Day");
		
		}*/
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your size in the below range :\n{26 , 28 , 30 , 32 , 34 , 36}");
		System.out.println("\nEnter Size :");
		int size=sc.nextInt();
		// Using Switch case
		switch(size) {
		
		case 26:System.out.println("Extra Small");
		break;
		case 28:System.out.println("Small");
		break;
		case 30:System.out.println("Medium");
		break;
		case 32:System.out.println("Large");
		break;
		case 34:System.out.println("Extra Large");
		break;
		case 36:System.out.println("Extra Extra Large");
		break;
		default:System.out.println("Invalid size");
		
		}
	
	}

}
