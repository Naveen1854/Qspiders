public class Exception3 {
    static void display() throws ArithmeticException {
        int a = 3 / 0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println("Successfully displayed: ");
    }
}
