// Method without parameters, without returning values.
class Addition
{
	int add(){
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	public static void main(String[] args)
	{
		Addition ad = new Addition();
		int result = ad.add();
		System.out.println(result);
	}
}
