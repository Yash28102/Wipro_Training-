package OOPS;



public class Methods {
	
//	void sound(String animalname,String sound) // Parameterized method 
//	{
//		System.out.println("Animal Name : "+animalname);
//		System.out.println("Animal Sound : "+sound);
//	}
//	
//	void show() {// no argument method.
//		System.out.println("Nothing to say...");
//	}


	// Method overloading- means multiple methods have same name. 
	//					   and it may having same parameters also but there formats are to be different.
	
	
	
/*	void details(String name,int roll) // Parameterized method 
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student roll : "+roll);
	}
	
	void details(int roll,String name) // Parameterized method 
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student roll : "+roll);
	}
	
	void details(int age,String name,int roll) // Parameterized method 
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student age : "+age);
	}
	
	*/
	
	
	
	void details(String name,int age) // Parameterized method 
	{
		System.out.println("Patient Name : "+name);
		System.out.println("Patient age : "+age);
	}
	
	void details(int ID,String name) // Parameterized method 
	{
		System.out.println("Patient Name : "+name);
		System.out.println("Patient ID : "+ID);
	}
	
	void details(String D_name,String P_name,int ID) // Parameterized method 
	{
		System.out.println("Doctor Name : "+D_name);
		System.out.println("Patient ID : "+ID);
		System.out.println("Patient age : "+P_name);
	}
	
	
	
	public static void main(String[] args) {
		
		Methods m=new Methods();//used to initialize object.
		m.details("X","yash",2525);
		

	}

}
