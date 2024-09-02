class  ArrayDemo1
{
	int sum = 0;
	public static void main(String[] args)
	{
		int [] arr = {11,22,24};
		ArrayDemo1 ad = new ArrayDemo1();
		int total = ad.display(arr);
		System.out.println(total);
	}
	int display(int [] temp){
		for (int x : temp)
		{
			sum = sum + x;
		}
		return sum;
	}
}
