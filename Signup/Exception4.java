//User Defined Exceptions:

import java.util.Scanner;

public class Exception4 extends Exception {
    public Exception4(String str) {
        super(str);
    }

    public static void main(String[] args) throws Exception4 {
        System.out.println("Enter your age: ");
        try {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age < 18) {
                throw new Exception4("You are not allowed to vote: ");
            } else {
                System.out.println("You are allowed to vote: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
