import java.util.Scanner;
class CountVowels
{
	public static int countvowels(String str){
		int count = 0;
		for (int i=0; i < str.length(); i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		System.out.println("Number of Vowels in String: " + countvowels(str)+"\n");
	}
}
