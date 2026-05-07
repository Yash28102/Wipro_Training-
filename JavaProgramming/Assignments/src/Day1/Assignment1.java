package Day1;

public class Assignment1 {

	public class Main {
	    public static void main(String[] args) {

	        // 1. Positive or Negative
	        int num1 = 10;
	        if(num1 > 0)
	            System.out.println("1. Positive");
	        else
	            System.out.println("1. Negative");

	        // Output: 1. Positive


	        // 2. Even or Odd
	        int num2 = 7;
	        if(num2 % 2 == 0)
	            System.out.println("2. Even");
	        else
	            System.out.println("2. Odd");

	        // Output: 2. Odd


	        // 3. Largest of two numbers
	        int a = 5, b = 9;
	        if(a > b)
	            System.out.println("3. " + a);
	        else
	            System.out.println("3. " + b);

	        // Output: 3. 9


	        // 4. Largest of three numbers
	        int x = 10, y = 25, z = 15;
	        if(x>=y && x>=z)
	            System.out.println("4. " + x);
	        else if(y>=x && y>=z)
	            System.out.println("4. " + y);
	        else
	            System.out.println("4. " + z);

	        // Output: 4. 25


	        // 5. Leap year
	        int year = 2024;
	        if((year%4==0 && year%100!=0) || year%400==0)
	            System.out.println("5. Leap Year");
	        else
	            System.out.println("5. Not Leap Year");

	        // Output: 5. Leap Year


	        // 6. Vowel or Consonant
	        char ch = 'a';
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	            System.out.println("6. Vowel");
	        else
	            System.out.println("6. Consonant");

	        // Output: 6. Vowel


	        // 7. Voting eligibility
	        int age = 20;
	        if(age >= 18)
	            System.out.println("7. Eligible");
	        else
	            System.out.println("7. Not Eligible");

	        // Output: 7. Eligible


	        // 8. Divisible by 5 and 11
	        int num3 = 55;
	        if(num3%5==0 && num3%11==0)
	            System.out.println("8. Divisible");
	        else
	            System.out.println("8. Not Divisible");

	        // Output: 8. Divisible


	        // 9. Grade
	        int marks = 82;
	        if(marks>=90)
	            System.out.println("9. Grade A");
	        else if(marks>=75)
	            System.out.println("9. Grade B");
	        else if(marks>=50)
	            System.out.println("9. Grade C");
	        else
	            System.out.println("9. Fail");

	        // Output: 9. Grade B


	        // 10. Zero Positive Negative
	        int num4 = 0;
	        if(num4>0)
	            System.out.println("10. Positive");
	        else if(num4<0)
	            System.out.println("10. Negative");
	        else
	            System.out.println("10. Zero");

	        // Output: 10. Zero


	        // 11. Smallest of three
	        int p = 3, q = 7, r = 1;
	        if(p<=q && p<=r)
	            System.out.println("11. " + p);
	        else if(q<=p && q<=r)
	            System.out.println("11. " + q);
	        else
	            System.out.println("11. " + r);

	        // Output: 11. 1


	        // 12. Loan eligibility
	        int loanAge = 30;
	        int salary = 40000;
	        if(loanAge>=21 && salary>=25000)
	            System.out.println("12. Eligible");
	        else
	            System.out.println("12. Not Eligible");

	        // Output: 12. Eligible


	        // 13. Divisible by 3 or 7
	        int num5 = 21;
	        if(num5%3==0 || num5%7==0)
	            System.out.println("13. Divisible");
	        else
	            System.out.println("13. Not Divisible");

	        // Output: 13. Divisible


	        // 14. Calculator
	        int n1 = 10, n2 = 5;
	        char op = '+';

	        switch(op){
	            case '+': System.out.println("14. " + (n1+n2)); break;
	            case '-': System.out.println("14. " + (n1-n2)); break;
	            case '*': System.out.println("14. " + (n1*n2)); break;
	            case '/': System.out.println("14. " + (n1/n2)); break;
	        }

	        // Output: 14. 15


	        // 15. Day of week
	        int day = 3;
	        switch(day){
	            case 1: System.out.println("15. Monday"); break;
	            case 2: System.out.println("15. Tuesday"); break;
	            case 3: System.out.println("15. Wednesday"); break;
	            case 4: System.out.println("15. Thursday"); break;
	            case 5: System.out.println("15. Friday"); break;
	            case 6: System.out.println("15. Saturday"); break;
	            case 7: System.out.println("15. Sunday"); break;
	        }

	        // Output: 15. Wednesday

	    }
	}

}
