class  WhileLoopDemo
{
	public static void main(String[] args) 
	{
		int num = 50;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
			System.out.println("Not prime");
		}else{
			System.out.println("Prime");
			}
		}
	}
}
