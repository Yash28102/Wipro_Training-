package Day2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Even or Odd using switch
        int num = 7;
        switch(num % 2){
            case 0: System.out.println("1. Even"); break;
            case 1: System.out.println("1. Odd"); break;
        }


        // 2. Vowel or Consonant using switch
        char ch = 'a';
        switch(ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("2. Vowel"); break;
            default: System.out.println("2. Consonant");
        }


        // 3. Grade performance
        char grade = 'A';
        switch(grade){
            case 'A': System.out.println("3. Excellent"); break;
            case 'B': System.out.println("3. Good"); break;
            case 'C': System.out.println("3. Average"); break;
            case 'D': System.out.println("3. Poor"); break;
            default: System.out.println("3. Fail");
        }


        // 4. ATM Menu
        int choice = 1;
        int balance = 1000;
        switch(choice){
            case 1: System.out.println("4. Balance: "+balance); break;
            case 2: balance+=500; System.out.println("4. Deposited"); break;
            case 3: balance-=200; System.out.println("4. Withdrawn"); break;
            case 4: System.out.println("4. Exit"); break;
        }


        // 5. Food menu
        int item = 2;
        switch(item){
            case 1: System.out.println("5. Burger - 100"); break;
            case 2: System.out.println("5. Pizza - 200"); break;
            case 3: System.out.println("5. Pasta - 150"); break;
        }


        // 6. Currency convert
        int opt = 1;
        double inr = 100;
        switch(opt){
            case 1: System.out.println("6. USD: "+(inr/83)); break;
            case 2: System.out.println("6. EUR: "+(inr/90)); break;
        }


        // 7. Role check
        String role="Admin";
        switch(role){
            case "Admin": System.out.println("7. Full Access"); break;
            case "User": System.out.println("7. Limited Access"); break;
            default: System.out.println("7. Guest Access");
        }


        // 8. Factorial using while
        int n=5,fact=1,i=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println("8. "+fact);


        // 9. Multiplication table
        int t=5,j=1;
        while(j<=10){
            System.out.println("9. "+t*j);
            j++;
        }


        // 10. Count digits
        int d=12345,count=0;
        while(d>0){
            count++;
            d/=10;
        }
        System.out.println("10. "+count);


        // 11. Reverse number
        int num1=1234,rev=0;
        while(num1>0){
            rev=rev*10+num1%10;
            num1/=10;
        }
        System.out.println("11. "+rev);


        // 12. Palindrome
        int p=121,temp=p,rev1=0;
        while(p>0){
            rev1=rev1*10+p%10;
            p/=10;
        }
        if(temp==rev1)
            System.out.println("12. Palindrome");
        else
            System.out.println("12. Not");


        // 13. Sum of digits
        int s=123,sum=0;
        while(s>0){
            sum+=s%10;
            s/=10;
        }
        System.out.println("13. "+sum);


        // 14. Armstrong
        int arm=153,temp1=arm,sum1=0;
        while(arm>0){
            int r=arm%10;
            sum1+=r*r*r;
            arm/=10;
        }
        if(sum1==temp1)
            System.out.println("14. Armstrong");
        else
            System.out.println("14. Not");


        // 15. Prime
        int prime=7,k=2,flag=0;
        while(k<=prime/2){
            if(prime%k==0){
                flag=1;
                break;
            }
            k++;
        }
        if(flag==0)
            System.out.println("15. Prime");
        else
            System.out.println("15. Not");


        // 16. Fibonacci
        int a=0,b=1,c1=0,terms=7;
        System.out.println("16.");
        while(c1<terms){
            System.out.println(a);
            int next=a+b;
            a=b;
            b=next;
            c1++;
        }

    }
}