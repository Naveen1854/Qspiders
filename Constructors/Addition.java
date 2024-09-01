class Addition
{
	int a;
	int b;
	int c;
	Addition(int x,int y){
		a = x;
		b = y;
	}
	public void add(){
		c = a + b;
		System.out.println("Additioin of: " + a + " and " + b + " is " + c);
	}
	public static void main(String[] args)
	{
		Addition ad = new Addition(10,40);
		ad.add();
	}
}
