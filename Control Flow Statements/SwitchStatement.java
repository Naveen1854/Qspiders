class  SwitchStatement
{
	public static void main(String[] args) 
	{
		int number = 54;
		String size;
		switch (number)
		{
		case 24: size = "small";
		break;
		case 34: size = "Medium";
		break;
		case 44: size = "Large";
		break;
		case 54: size = "Extra Large";
		break;
		default : size = "Not Available";
		}
		System.out.println("size: " + size);
	}
}
