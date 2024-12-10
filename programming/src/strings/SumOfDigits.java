package strings;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "abc123def@$";
        int sum = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum = sum+(ch-'0');
                sum=sum+ch;
            }
        }
            System.out.println(sum);
    }
}
