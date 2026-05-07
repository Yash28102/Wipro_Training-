package Day5;

// 1. package-like class (Addition & Subtraction)
class Operations {
    int add(int a,int b){
        return a+b;
    }

    int subtract(int a,int b){
        return a-b;
    }
}


// 2. Abstract class Bank
abstract class Bank{
    abstract int getInterestRate();
}

class SBI extends Bank{
    int getInterestRate(){
        return 7;
    }
}

class HDFC extends Bank{
    int getInterestRate(){
        return 8;
    }
}

class ICICI extends Bank{
    int getInterestRate(){
        return 9;
    }
}


// 3. Interface + Exception handling
interface Calculator{
    void divide(int a,int b);
}

class Test implements Calculator{

    public void divide(int a,int b){
        try{
            int result = a/b;
            System.out.println("3. Result: " + result);
        }
        catch(Exception e){
            System.out.println("3. Cannot divide by zero");
        }
    }
}



public class Assignment5 {

    public static void main(String[] args) {

        // 1. Addition & Subtraction
        Operations op = new Operations();
        System.out.println("1. Addition: " + op.add(10,5));
        System.out.println("1. Subtraction: " + op.subtract(10,5));

        // Output:
        // 1. Addition: 15
        // 1. Subtraction: 5


        // 2. Abstract class Bank
        Bank b;

        b = new SBI();
        System.out.println("2. SBI Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("2. HDFC Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("2. ICICI Rate: " + b.getInterestRate());

        // Output:
        // 2. SBI Rate: 7
        // 2. HDFC Rate: 8
        // 2. ICICI Rate: 9


        // 3. Interface + Exception handling
        Test t = new Test();
        t.divide(10,2);
        t.divide(10,0);

        // Output:
        // 3. Result: 5
        // 3. Cannot divide by zero

    }
}