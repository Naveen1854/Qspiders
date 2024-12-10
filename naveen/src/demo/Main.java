package demo;

class Main {
	String un;
	int id;
	double sal;
	
	public Main(String un,int id,double sal) {
		this.un=un;
		this.id=id;
		this.sal=sal;
	}
	public void details() {
		System.out.println("Name: " + un + ", Id: " + id + ", sal: " + sal);
//		System.out.println(id);
//		System.out.println(sal);
	}
	public class Driver{
		public static void print(Main m) {
			if(m.sal>30000.0) {
				m.details();
			}else {
				System.out.println(m.sal<30000.0);
			}
		}
	}
	public static void main(String[] args) {
		Main m1 = new Main("abc",101,50000.0);
		Main m2 = new Main("xyz",102,30000.0);
		Main m3 = new Main("pqr",103,45000.0);	
		Driver.print(m1);
		Driver.print(m2);
		Driver.print(m3);
		
		
	}
}