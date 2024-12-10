package strings;


// WRONG

public class PrimeIndexChars {
    public static void main(String[] args) {
        String str = "malayalam";
        int len = str.length();
        System.out.println("Lenght of str: " + len);
        for(int i=0;i<len;i++){
            if(isPrime(len)){
                char ch = str.charAt(i);
                System.out.println(ch);
            }
        }
    }
    public static boolean isPrime(int a){
        int count=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                count ++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}
