public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Topic: Exception Handling: ");
        try {
            int arr[] = { 4, 5 };
            try {
                arr[2] = 3 / 0;
            } catch (ArithmeticException ae) {
                ae.printStackTrace();
            }
            arr[3] = 7;
        } catch (ArrayIndexOutOfBoundsException aibe) {
            aibe.printStackTrace();
        } finally {
            System.out.println("Exception Succesfully Handled by Naveen");
        }
    }
}
