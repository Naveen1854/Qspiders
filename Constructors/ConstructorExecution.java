class  ConstructorDemo
{
	//default Constructor:
	//public ConstructorDemo(){

	//}

	//User Defined non-parametrised Constructor:
	public ConstructorDemo(){
			System.out.println("Hello");
	}

		//User defined Parametrised Constructor:
		public ConstructorDemo(String name){
			System.out.println("Welcome " + name);
		}

		public ConstructorDemo(int a,int b){
			int c = a + b;
			System.out.println(c);
		}
	}

	class ConstructorExecution
	{
		public static void main(String[] args)
	{
		//Constructor call:
		 new ConstructorDemo();
		new ConstructorDemo("Naveen");
		new ConstructorDemo(10,15);
		}
	}
