class Comparision{
public static void main(String [] args){
int num = 5643;
int LD = num%10;
int LSD = (num %100)/10;
Boolean result = LD == LSD;
System.out.println(result);
}
}