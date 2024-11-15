package practice;

class Calculator{
	String un;
	long mobNo;
	private static Calculator c1;
	private Calculator(String un,long mobNo) {
		this.un=un;
		this.mobNo=mobNo;
	}

	public static Calculator createObj(String un,long mobNo) {
		if(c1 == null) {
			c1 = new Calculator(un,mobNo);
			return c1;
		}else {
			return c1;
		}
	}
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public class SingleTonClass {
		public static void main(String[] args) {
			Calculator res1 = Calculator.createObj("Naveen", 85229911L);
			res1.add(2, 3);
			Calculator res2 = Calculator.createObj("abc", 9490454104L);
			res2.add(4,1);
		}
	}
}


