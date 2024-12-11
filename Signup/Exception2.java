public class Exception2 {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote: ");
        } else {
            System.out.println("You are eligible to vote: ");
        }
    }

    public static void main(String[] args) {
        validate(15);
        System.out.println("Process completed: ");

    }
}
