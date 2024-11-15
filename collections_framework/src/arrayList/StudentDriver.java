package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> s1 = new ArrayList<>();
		s1.add(new Student("abc",24,50000.0));
		s1.add(new Student("xyz",54,60000.0));
		s1.add(new Student("pqr",19,80000.0));
		Collections.sort(s1);
		System.out.println(s1);
	
	}
}
