import java.util.Scanner;
class  MiddleCharOfStr
{
	public static String middle(String str){
		int position;
		int length = str.length();
		System.out.println("Length of String is:" + length);
		if(str.length()%2==0){
			 position = str.length()/2-1;
				length = 2;
		}else{
			position = str.length()/2;
			 length=1;
		}
		return str.substring(position,position + length);
	}
		public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print("The Middle Character in the String is: "+middle(str)+" \n");
		}
}
