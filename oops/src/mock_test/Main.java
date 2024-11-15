package mock_test;

public class Main extends Swiggy {

	private static 	int vegBiryaniCount=20;
	private static int chickenBiryaniCount=30;

	public Main(String name, long mobNo, String email) {
		super(name, mobNo, email);
	}

	public static int getVegBiryaniCount() {
		return vegBiryaniCount;
	}

	public static void setVegBiryaniCount(int vegBiryaniCount) {
		Main.vegBiryaniCount = vegBiryaniCount;
	}

	public static int getChickenBiryaniCount() {
		return chickenBiryaniCount;
	}

	public static void setChickenBiryaniCount(int chickenBiryaniCount) {
		Main.chickenBiryaniCount = chickenBiryaniCount;
	}

	@Override
	public void order(String item, int count, BankAccount b1) {
		if(item=="vegBiryani" )
		{
			if(vegBiryaniCount>=count)
			{
				if(b1.bal>= count*110)
				{
					vegBiryaniCount=vegBiryaniCount-count;
					b1.bal=b1.bal- (count*110);
					System.out.println(count + " veg biryani ordered!");
				}
				else
				{
					System.out.println(b1.name + ", insuf bal in you account!!");
				}
			}
			else
			{
				System.out.println(count+" veg biryani's are unavailable...Sorry!");
				System.out.println("available biryani count is "+ vegBiryaniCount);
			}
		}
		else if(item=="chickenBiryani" )
		{
			if(chickenBiryaniCount>=count)
			{
				if(b1.bal>= count*110)
				{
					chickenBiryaniCount=chickenBiryaniCount-count;
					b1.bal=b1.bal- (count*110);
					System.out.println(count + " chicken biryani ordered!");
				}
				else
				{
					System.out.println(b1.name + ", insuf bal in you account!!");
				}
			}
			else
			{
				System.out.println(count+" veg biryani's are unavailable...Sorry!");
				System.out.println("available biryani count is "+ vegBiryaniCount);
			}
		}
		else
		{
			System.out.println("invlaid item");
		}
	}
}
