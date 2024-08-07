class Naveen{
public void run(){
System.out.println("Program is running");
}
public void add(){
System.out.println("Non parametrized Constructor");
}
public void run(int a,int b){
int c = a + b;
System.out.println("Addition of "+ a + " and "+b+ " is: "+c);
}
public static void main(String[]args){
Naveen n=new Naveen();
n.run(10,40);
n.run();
n.add();
}
}