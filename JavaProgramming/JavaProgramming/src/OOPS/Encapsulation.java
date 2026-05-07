package OOPS;

public class Encapsulation {

    private String name;
    private int rollno;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public int getRollno() {
        return rollno;
    }

    // setter
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static void main(String[] args) {

        Encapsulation st = new Encapsulation();

        st.setName("Yash");
        st.setRollno(101);

        System.out.println("Name: " + st.getName());
        System.out.println("Roll No: " + st.getRollno());
    }
}