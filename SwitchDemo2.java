class SwitchDemo2  
{
	public static void main(String[] args) 
	{
		char c = 'a';
		switch (c)
		{
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U': 
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o':
		case 'u': System.out.println(c+" is vowel");
		break;
		default :System.out.println("Not Vowel");
		}
	}
}
