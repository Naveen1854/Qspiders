package AggregateOperations;

import java.util.*;
// import java.util.stream.Collectors;
public class Streams {
    public static void main(String[] args) {
       /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenSquares = numbers.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println("Even Squares: " + evenSquares); 
    }*/

    List<String> fruits = Arrays.asList("apple", "banana", "orange", "mango");
    // fruits.add("graps"); java.lang.UnsupportedOperationException
        long count = fruits.stream()
                           .filter(fruit -> fruit.startsWith("a"))
                           .count();
        System.out.println("Count: " + count);
    }
}