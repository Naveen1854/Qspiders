package instanceOf;

class Addition{
	public  void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
class Subtraction{
	public  void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void sub(int a, int b, int c) {
		System.out.println(a-b-c);
	}
}
class Service{
	public static Object operation(int x) {
		if(x==1) {
			Object a1 = new Addition(); //up casting
			return a1;
		}else if(x==2) {
			Object a2 = new Subtraction(); //up casting
			return a2;
		}
		else {
			return null;
		}
	}
}
public class ObjectReturning {
	public static void main(String[] args) {
		Addition res1 = (Addition)Service.operation(1); // down casting 
		res1.add(45,100);
		Subtraction res2 = (Subtraction)Service.operation(2); //down casting 
		res2.sub(70,10);
	}
}
