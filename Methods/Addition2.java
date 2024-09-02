class Addition2
{
	int add(int x, int y){
		int z = x+y;
		return z;
	}
	public static void main(String[] args)
	{
		Addition2 ad = new Addition2();
		int result = ad.add(10,20);
		System.out.println(result);
	}
}
