import java.util.Scanner;
class AverageaOfThree{
  public static int avg(int a, int b, int c){
    int sum = a + b + c;
    int average = sum / 3;
    return average;
  }
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 1st Number: ");
  int a = sc.nextInt();
  System.out.println("Enter 2nd Number: ");
  int b = sc.nextInt();
  System.out.println("Enter 3rd Number: ");
  int c = sc.nextInt();
  System.out.println("The Average of 3 Numbers is: "+avg(a,b,c));
  }
}