package OOPS;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) throws InterruptedException{//Thread.sleep() may throw InterruptedException.
		// TODO Auto-generated method stub
//		"If sleep causes error, I am not handling it here — pass it to JVM(java virtual machine)"
//		System.out.println(1);
//		System.out.println(1);
//		System.out.println(1);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter divident");;
		int a=sc.nextInt();
		System.out.println("Enter divisor");;
		int b=sc.nextInt();
		Thread.sleep(300);// this will stop the program for sometimes...
		
		
		try {
			System.out.println(1/0);
		}
		catch(Exception e) {
			System.out.println("Exception Handled which is occured when divide by 0");
	}
		finally {
			System.out.println("pass the level");
		}
		
		System.out.println(1);
			System.out.println(1);}
}
