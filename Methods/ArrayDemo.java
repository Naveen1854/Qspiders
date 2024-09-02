class  ArrayDemo
{
	public static void main(String[] args)
	{
		int [] arr = {11,22,24,46,57,89};
		ArrayDemo ad = new ArrayDemo();
		ad.display(arr);
	}
	void display(int [] temp){
		for (int z : temp)
		{
			System.out.println(z);
		}
	}
}
