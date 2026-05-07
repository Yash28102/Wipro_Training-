package Day10;

import java.io.*;
import java.util.*;

public class Assignment10 {

    public static void main(String[] args) throws Exception {

        String filePath = "sample.txt";

        // Create file if not exists
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();

            // add default content for testing
            FileWriter fw = new FileWriter(file);
            fw.write("I love Java\nJava is powerful\nHello World\n");
            fw.close();
        }


        // 1. Count lines, words, characters
        BufferedReader br = new BufferedReader(new FileReader(file));

        int lines = 0, words = 0, chars = 0;
        String line;

        while((line = br.readLine()) != null){
            lines++;
            chars += line.length();
            words += line.split(" ").length;
        }
        br.close();

        System.out.println("1. Lines: " + lines);
        System.out.println("1. Words: " + words);
        System.out.println("1. Characters: " + chars);

        // Output Example:
        // 1. Lines: 3
        // 1. Words: 9
        // 1. Characters: 46



        // 2. Append data
        Scanner sc = new Scanner(System.in);
        System.out.print("2. Enter text to append: ");
        String input = sc.nextLine();

        FileWriter fw = new FileWriter(file, true);
        fw.write(input + "\n");
        fw.close();

        System.out.println("2. Data appended successfully");

        // Example Input:
        // Hello Java

        // Output:
        // 2. Data appended successfully



        // 3. Print lines containing "Java"
        BufferedReader br2 = new BufferedReader(new FileReader(file));

        System.out.println("3. Lines containing 'Java':");

        while((line = br2.readLine()) != null){
            if(line.contains("Java")){
                System.out.println(line);
            }
        }
        br2.close();

        // Example Output:
        // I love Java
        // Java is powerful
        // Hello Java



        // 4. Count word "Java"
        BufferedReader br3 = new BufferedReader(new FileReader(file));

        int count = 0;

        while((line = br3.readLine()) != null){
            String[] arr = line.split(" ");
            for(String w : arr){
                if(w.equals("Java")){
                    count++;
                }
            }
        }
        br3.close();

        System.out.println("4. 'Java' count: " + count);

        // Example Output:
        // 4. 'Java' count: 3

    }
}