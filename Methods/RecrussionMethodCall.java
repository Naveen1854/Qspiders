class RecrussionMethodCall
{
	public static void m1(){
		System.out.println("m1 Started");
		m1();
		System.out.println("m1 Ended...");
	}
	public static void main(String[] args)
	{
		m1();
	}
}
