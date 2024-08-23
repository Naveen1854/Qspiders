import java.util.Scanner;
class MinOfThree{
  public static int min(int a, int b, int c){
    if(a<b && a<c){
      return a;
    }else if(b<c){
      return b;
    }else{
      return c;
    }
  }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 1st Number: ");
      int a = sc.nextInt();
      System.out.println("Enter 2nd Number: ");
      int b = sc.nextInt();
      System.out.println("Enter 2nd Number: ");
      int c = sc.nextInt();
      System.out.println("The Smallest is "+ min(a,b,c));
	}
}