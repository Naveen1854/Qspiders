package mock_test;

public class Instamart extends Swiggy {

	private static	int dairyMilkCount=8;
	private static int kitkatCount=10;
	private static int sliceCount=20;
	public Instamart(String name, long mobNo, String email) {
		super(name, mobNo, email);
	}
	
	public static int getDairyMilkCount() {
		return dairyMilkCount;
	}

	public static void setDairyMilkCount(int dairyMilkCount) {
		Instamart.dairyMilkCount = dairyMilkCount;
	}

	public static int getKitkatCount() {
		return kitkatCount;
	}

	public static void setKitkatCount(int kitkatCount) {
		Instamart.kitkatCount = kitkatCount;
	}

	public static int getSliceCount() {
		return sliceCount;
	}

	public static void setSliceCount(int sliceCount) {
		Instamart.sliceCount = sliceCount;
	}

	@Override
	public void order(String item, int count, BankAccount b1) {
		if(item=="dairyMilk" )
		{
			if(dairyMilkCount>=count)
			{
				dairyMilkCount=dairyMilkCount-count;
				if(b1.bal>= count*40)
				{
					b1.bal=b1.bal- (count*40);
					System.out.println(count + " dairy Milk ordered!");
				}
				else
				{
					System.out.println(b1.name + ", insuf bal in you account!!");
				}
			}
			else
			{
				System.out.println(count+" dairy Milk's are unavailable...Sorry!");
				System.out.println("available dairy Milk are "+ dairyMilkCount);
			}
		}
		else if(item=="kitkat" )
		{
			if(kitkatCount>=count)
			{
				kitkatCount=kitkatCount-count;
				if(b1.bal>= count*30)
				{
					b1.bal=b1.bal- (count*30);
					System.out.println(count + " kitkat ordered!");
				}
				else
				{
					System.out.println(b1.name + ", insuf bal in you account!!");
				}
			}
			else
			{
				System.out.println(count+"  kitkat's are unavailable...Sorry!");
				System.out.println("available kitkat are "+ kitkatCount);
			}
		}
		else if(item=="slice" )
		{
			if(sliceCount>=count)
			{
				sliceCount=sliceCount-count;
				if(b1.bal>= count*20)
				{
					b1.bal=b1.bal- (count*20);
					System.out.println(count + " slice ordered!");
				}
				else
				{
					System.out.println(b1.name + ", insuf bal in you account!!");
				}
			}
			else
			{
				System.out.println(count+"  slice are unavailable...Sorry!");
				System.out.println("available slice are "+ sliceCount);
			}
		}
		else
		{
			System.out.println("invlaid item");
		}
	}
}
