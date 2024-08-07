class CheckAlphabet{
public static void main(String[] aargs){
char c = 'B';
Boolean res = ((c>65 && c<=99) || (c>97 && c<=122)) && c != 65 && c != 97;
System.out.println(res);
}
}