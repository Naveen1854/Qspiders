public class Demo2 {
    public static int add(int a,int b){
        return sub(a,b) + sub (a,b);
    }
    public static int sub(int a,int b){
        return mul(a,b) - mul(a,b);
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(add(4,2));
    }
}
