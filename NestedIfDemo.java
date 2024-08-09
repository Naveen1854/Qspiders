class NestedIfDemo 
{
	public static void main(String[] args) 
	{
		String un = "Naveen";
		long psw = 1854L;
		if(un == "Naveen"){
			if(psw == 1854L){
				System.out.println("Login Successful");
			}else{
				System.out.println("Incorrect Password who are You! ... ");
			}
		}else{
			System.out.println("Incorrect UserName");
		}
	}
}
