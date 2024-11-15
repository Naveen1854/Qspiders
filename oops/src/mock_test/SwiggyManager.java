package mock_test;

public class SwiggyManager {

	public static Swiggy createAccount(String type,String name,long mobNo,String email)
	{
		if(type=="Main")
		{
			Swiggy s1=new Main(name, mobNo, email);
			return s1;
		}
		else if(type=="Instamart")
		{
			Swiggy s2=new Instamart(name, mobNo, email);
			return s2;
		}
		else 
		{
			return null;
		}
	}
}
