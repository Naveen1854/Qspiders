class Demo{
    public static void add(int a,int b){
        System.out.println("Add Started");
        System.out.println(a+b);
        sub(a++,++b);
        System.out.println("Add Ended");
    }
    public static void sub(int a,int b){
        System.out.println("Sub Started");
        System.out.println(a-b);
        mul(a++,b--);
        System.out.println("Sub Ended");
    }
    public static void mul(int a,int b){
        System.out.println("Mul Started");
        System.out.println(a*b);
        System.out.println("Mul Ended");
    }
    public static void main(String args[]){
        add(4,2);
    }
}