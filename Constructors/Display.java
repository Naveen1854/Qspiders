class Display
{
	public static void main(String[] args)
	{
		new Display();
		new Display(54,"Bittu");
	}
	Display(){
	System.out.println("Hello Naveen!");
	}
	Display(int i, String name){
		System.out.println(" pin = " + i + " Welcome..." + name);
	}
}
