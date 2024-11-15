package objectClassMethods;

public class EqualsMethod {
	public static void main(String[] args) {
		Student s1 = new Student("Naveen", 54, "chpt", 85229911L);
		Student s2 = new Student("Naveen", 54, "chpt", 85229911L);
		// Check if the two student objects are equal
		if (s1.equals(s2)) {	//s2.equals()
			System.out.println("The students are equal.");
		} else {
			System.out.println("The students are not equal.");
		}
	}
}
