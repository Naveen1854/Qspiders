class Max
{
	public static int a = 10, b =20, c = 30;
	public static int max(){
		if(a>b && a>c){
			return a;
		}else if(b>c){
			return b;
		}else {
			return c;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(max());
	}
}
