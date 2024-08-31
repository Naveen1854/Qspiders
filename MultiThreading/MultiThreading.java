class  MultiThreading
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread();
	//	System.out.println("Welcome to MultiThreading...");

		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("Naveen");
		System.out.println(t1.getName());
	}
}
