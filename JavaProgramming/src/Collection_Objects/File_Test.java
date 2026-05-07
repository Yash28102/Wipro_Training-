package Collection_Objects;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class File_Test {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("C:/Users/My pc/eclipse-workspace/JavaProgramming/SampleFile.txt");		
		
		//Scanner sc = new Scanner(file);
		
//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
//		
//		sc.close();
		
		
		File file = new File("Demo1.txt");
		file.createNewFile();
		FileWriter wr=new FileWriter("Demo1.txt");
		wr.write("Let's learn Java Programming\t Selenium SDET");
		//wr.write("Selenium SDET");
		wr.close();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
	}
}
