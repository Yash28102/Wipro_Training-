package Day11;

import java.util.*;

public class Assignment11 {

    public static void main(String[] args) {

        // 1. First Non-Repeating Character
        String str = "aabbcdde";

        LinkedHashMap<Character, Integer> map1 = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(char c : map1.keySet()){
            if(map1.get(c) == 1){
                System.out.println("1. First Non-Repeating: " + c);
                break;
            }
        }

        // Output:
        // 1. First Non-Repeating: c



        // 2. Remove Duplicate Characters
        String str2 = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : str2.toCharArray()){
            set.add(c);
        }

        String result = "";
        for(char c : set){
            result += c;
        }

        System.out.println("2. After Removing Duplicates: " + result);

        // Output:
        // 2. After Removing Duplicates: progamin



        // 3. Element with Maximum Frequency
        int arr[] = {1,2,2,3,3,3,4};

        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int num : arr){
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        int maxKey = 0, maxValue = 0;

        for(int key : map2.keySet()){
            if(map2.get(key) > maxValue){
                maxValue = map2.get(key);
                maxKey = key;
            }
        }

        System.out.println("3. Max Frequency Element: " + maxKey);

        // Output:
        // 3. Max Frequency Element: 3



        // 4. Sort Map by Keys
        HashMap<Integer,String> map3 = new HashMap<>();
        map3.put(3,"C");
        map3.put(1,"A");
        map3.put(2,"B");

        TreeMap<Integer,String> sorted = new TreeMap<>(map3);

        System.out.println("4. Sorted Map: " + sorted);

        // Output:
        // 4. Sorted Map: {1=A, 2=B, 3=C}

    }
}