class  MaxOfThree
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 50;
		String res = a>b && a>c ? "max" : (b>c ? b+ " is max" : c + " is max");
		System.out.println(res);
	}
}
