package Day6;

class Box{
    int length;

    Box(int length){
        this.length = length;
    }
}

public class Assignment6 {

    // 1. method changing integer
    static void change(int x){
        x = 50;
        System.out.println("Inside method: " + x);
    }

    // 2. modify object
    static void modify(Box b){
        b.length = 200;
    }

    public static void main(String[] args) {

        // 1. pass by value
        int a = 10;
        System.out.println("1. Before: " + a);
        change(a);
        System.out.println("1. After: " + a);

        // Output:
        // 1. Before: 10
        // Inside method: 50
        // 1. After: 10



        // 2. object modification
        Box b = new Box(100);
        System.out.println("2. Before: " + b.length);
        modify(b);
        System.out.println("2. After: " + b.length);

        // Output:
        // 2. Before: 100
        // 2. After: 200



        // 3. check digit
        char ch = '5';

        if(Character.isDigit(ch))
            System.out.println("3. Digit");
        else
            System.out.println("3. Not Digit");

        // Output:
        // 3. Digit



        // 4. compare strings
        String s1 = "Java";
        String s2 = "Java";

        if(s1.equals(s2))
            System.out.println("4. Equal");
        else
            System.out.println("4. Not Equal");

        // Output:
        // 4. Equal



        // 5. valueOf method
        int num = 100;
        String str = String.valueOf(num);

        System.out.println("5. " + str);

        // Output:
        // 5. 100



        // 6. Boolean wrapper
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");

        System.out.println("6. " + b1);
        System.out.println("6. " + b2);

        // Output:
        // 6. true
        // 6. false



        // 7. null to wrapper
        Integer i = null;
        Double d = null;
        Boolean bl = null;

        System.out.println("7. " + i);
        System.out.println("7. " + d);
        System.out.println("7. " + bl);

        // Output:
        // 7. null
        // 7. null
        // 7. null

    }
}
