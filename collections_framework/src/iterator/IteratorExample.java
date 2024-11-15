package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry"));
        list.add("Mango");
//        list.add("Banana");
//        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            
            // Safely remove elements that meet a condition
            if (fruit.equals("Banana")) {
                iterator.remove();
            }
        }
        
        System.out.println("List after removal: " + list); // Output: [Apple, Cherry]
    }
}

