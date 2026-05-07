package JavaPackage;

import java.util.Scanner;

public class Divisible_11_5 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number :");
			int n=sc.nextInt();
			if (n%5==0 && n%11==0) {
				System.out.println("N is divisible by both 11 and 5.");
			}
			else {
				System.out.println("N is not divisible by 11 and 5.");
			}

		}

	

}
