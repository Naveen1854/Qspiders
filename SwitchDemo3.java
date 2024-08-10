class SwitchDemo3 
{
	public static void main(String[] args) 
	{
		char c = 'A';
		switch (c)
		{
		case 'A','E','I','O','U','a','e','i','o','u': System.out.println(c + " is Vowel");
		break;
		default: System.out.println(c + " is Not Vowel");
		}
	}
}
