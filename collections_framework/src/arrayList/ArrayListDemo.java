package arrayList;

import java.util.ArrayList;
import java.util.Collections;

//null values are allowed
//Duplicate objects accepted
//maintain insertion order
//size is not fixed
//store null values
//underlaying data structure is resizable array
//default initial capacity is 10
//load factor is 0.75
//it has 3 constructors

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			al.add(i);
		}
		al.add(4);
		System.out.println(al);
		System.out.println( al.add(10));

		ArrayList <Object> al1 = new ArrayList<Object>();
		al1.add("Name: " + "Naveen");
		al1.add("Salary: " + 5000.0);
		al1.add("Id: " + 101);
		al1.add("Gender: " + 'M');
		System.out.println(al1);

		ArrayList <Integer> al2 = new ArrayList<>();
		al2.add(54);
		al2.add(24);
		al2.add(10);
		al2.add(5);

		ArrayList <Integer> al3 = new ArrayList<>();
		al3.add(2);
		al3.add(4);
		al3.addAll(al2);
		System.out.println(al3);

		ArrayList  <Integer> al4 = new ArrayList<>(al3);
		al4.add(20);
		al4.add(20); // Duplicate values accepted
		al4.add(null); //null values are allowed
		System.out.println(al4);


		ArrayList <Integer> list = new ArrayList<Integer>();

		//add elements
		list.add(0);
		list.add(1);
		list.add(4);
		System.out.println(list);

		//get elements
		System.out.println(list.get(2));
		int element = list.get(1);
		System.err.println(element);

		//add elements in between
		list.add(2,2);
		//		list.add(8,4);  Exception: IndexOutOfBoundsException: Index: 8, Size: 4
		System.out.println(list);

		//set element
		list.set(3, 4);
		System.out.println(list);

		//delete element
		list.remove(3);
		System.out.println(list);

		//size
		System.out.println("size of List is : " + list.size());

		//loops
		for(int i=0;i<list.size();i++) {
			//			System.out.println(list.get(i));
			int res = list.get(i);
			System.out.println(res);
		}

		//sorting
		list.add(8);
		list.add(5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);


		ArrayList<String> l = new ArrayList<String>();
		l.add("Apple");
		l.add("Banana");
		l.add("Cherry");
		System.out.println(l);

		// Accessing elements by index
		String ans = l.get(2);
		System.out.println(ans);
		System.out.println(l.get(1));

		// Adding an element at a specific index
		l.add(1,"Grapes");
		System.out.println(l);

		//for each loop
		for(String fruit : l) {
			System.out.println(fruit);
		}
		
		//isEmpty()
		System.out.println(l.isEmpty());
		
		//contains()
		System.out.println(l.contains("Banana"));
		
		
		//clear()
		l.clear();
		System.out.println(l);
		
	}
}
