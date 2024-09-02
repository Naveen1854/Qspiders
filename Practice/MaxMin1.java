class MaxMin1
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 10;
		int c = 15;
		if(a < b){
			if(a < c){
				System.out.println(a+ " is min");
			}else{
				System.out.println(c + "is min");
			}
		}else if(b < c){
		System.out.println(b+"is min");
	}else{
		System.out.println(c + " is min");
		}
	}
}
