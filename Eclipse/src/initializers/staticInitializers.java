package initializers;

public class staticInitializers {
	static int a = 10;
	int b = 20;
	static {
		System.out.println("static block-1");
	}
	
	public staticInitializers() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Non static block-1");
	}
	
	public static void main(String[] args) {
		staticInitializers si = new staticInitializers();
		System.out.println("Main method");
		System.out.println(a);
		System.out.println(si.b);
	}
	
	 {
		System.out.println("Non static block-2");
		}
	}
