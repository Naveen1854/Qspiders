class SequenceMethodCall
{
	public static void add(int a ,int b){
		System.out.println("Additiion Started: ");
		sub(20,40);
		mul(4,8);
		System.out.println(a+b);
		System.out.println("Addition Ended: ");
	}
	public static void sub(int a, int b){
		System.out.println("Subtraction Started: ");
		System.out.println(a-b);
		System.out.println("Subtraction Ended: ");
	}
	public static void mul(int a, int b){
		System.out.println("Multiplication Started: ");
		System.out.println(a*b);
		System.out.println("Multiplication Ended: ");
	}
	public static void main(String[] args)
	{
		add(10,20);
	}
}
