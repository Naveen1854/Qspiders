package youtube;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: ");
		System.out.println("a = " + a + " and " + "b = " + b);
		
		int temp = a;
		 	a = b;
		 	b = temp;
		 	
		 	System.out.println("After swapping: ");
		 	System.out.println("a = " + a + " and " + "b= " + b);
	}

}
