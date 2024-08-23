class MethodDemo
{

	 static int d = 2;
	 static int e = 5;
		static void add(){
			int a = 10;
			int b = 40;
			int c = a + b;
			System.out.println(c);
		}
		public static void mul(){
			int res = d * e;
			System.out.println(res);
		}
	public static void main(String args[]){
		add();
		mul();
	}
}
