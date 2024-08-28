class  ConstructorDemo
{
	//default Constructor:
	//public ConstructorDemo(){

	//}

	//User Defined non-parametrised Constructor:
	public ConstructorDemo(){
		for (int i=1;i<=5 ;i++ )
		{
			System.out.println("Hello World!");
		}
	}

		//User defined Parametrised Constructor:
		public ConstructorDemo(String name){
			System.out.println(name);
		}
	}
	class ConstructorExecution
	{
		public static void main(String[] args)
	{
		//Constructor call:
		ConstructorDemo cd = new ConstructorDemo();
		//cd.ConstructorDemo();
		cd.ConstructorDemo("Naveen");
		}
	}
