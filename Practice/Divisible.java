/* Check  if the given number is divisible by 3 or divisible by 5 0r 
divisibe by both 3 and 5 or not divisible by 3 and 5*/

class  Divisible
{
	public static void main(String[] args) 
	{
		int num = 15;
		if(num % 3 == 0 && num % 5 == 0){
			System.out.println(num + " Divisible by both 3 and 5");
		} else if(num%3 == 0){
			System.out.println(num+ " Divisible by 3");
		}else{
			System.out.println(num + " Not Divisible by both 3 and 5");
		}
	}
}
