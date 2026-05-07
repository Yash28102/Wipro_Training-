package Keyword_practice;

public class Emp {
	/*int empid;
	String name;
	static String companyname="Wipro";
	
	void show(int empid1,String name1) {
		empid=empid1; // without assignment it will print 0 for int and null for string.
		name=name1;	//if we use global variable like below while printing and
					// and after that while we call this show method if we put arguements inside it it will print 0 and null.
					// if we assign then there will be no issue in the output.
		System.out.println("Empid : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Company name : "+companyname);
		
				
	}
	static void details(int empid1,String name1) {
		System.out.println("Company name : "+companyname);
	}*/
	static class Innerclass
	{
		void testt()
		{
			System.out.println("Inner class Method");
		}
		
	}
	static
		{
			System.out.println("block");
		}
		
		{
			System.out.println("block");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Emp ob=new Emp();
//		ob.show(101,"yash");
		Emp.Innerclass test=new Innerclass();
		test.testt();

	}

}
