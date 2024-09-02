//Multiple inheritance is not supported in java.
//There will be ambiguity to call the method of A or B class.
class A {
	void msg(){
		System.out.println("Hello");
	}
}
	class B{
		void msg(){
			System.out.println("Welcome");
		}
	}
	class MultipleInheritance extends A,B{
	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.msg();
	}
}
