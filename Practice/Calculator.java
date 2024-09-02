public class Calculator{
public int add(int a , int b){
int c= a+b;
return c;
}
public double add(double a,double b){
return a+b;
}
public static void main(String args[]){
Calculator c=new Calculator();
c.add(10,20);
c.add(10,40);
}
}