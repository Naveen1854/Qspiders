package strings;

public class ReadDigits {
    public static void main(String[] args) {
        String str = "abc123xyz";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>=48 && ch <= 57){
                System.out.println(ch);
            }
        }
    }
}
