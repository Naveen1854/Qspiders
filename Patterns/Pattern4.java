class Pattern4
{
	public static void main(String args[]){
		int n=10 ;
		for (int i=1;i<=n;i++)
		{
		    for(int space = 1;space<=n-i;space++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i*2-1;j++)
		    {
		        if(j==i*2-1 || j==1 ||  i*2-1 == n*2-1)
		        System.out.print("*");
		        else
		         System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
