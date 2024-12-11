class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Topic: Exception Handling: ");
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException ae) {
            // System.out.println(ae.getMessage());
            // System.out.println(ae.toString());
            ae.printStackTrace();
        } finally {
            System.out.println("Try and catch block are used to handle the exception: ");
            System.out.println("K.Naveen ");
        }
    }
}