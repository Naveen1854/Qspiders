package TypeCasting;

public class Execution {
	public static void print(Emp e) {
		if(e.sal > 30000.0) {
			e.details();
		}else {
			System.out.println("sal less than 30000.0");
		}
	}
	public static void main(String[] args) {
		Emp e1 = new Emp("Naveen",54,50000.0);
		Emp e2 = new Emp("Kiran",24,20000.0);
		Emp e3 = new Emp("Akshay",14,40000.0);
		print(e1);
		System.out.println("---------------");
		print(e2);
		System.out.println("---------------");
		print(e3);
	}
}
