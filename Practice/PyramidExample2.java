class PyramidExample2 
{
	public static void main(String[] args) 
	{
		int rev = 6;
		for(int i=1;i<=rev;i++){
			for(int j=rev;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
