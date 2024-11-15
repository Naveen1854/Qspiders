package practice;

public class Demo {

	public static void main(String[] args) {
//		char ch = 'A';
//		System.out.println(ch);
//		ch = ch++;
//		System.out.println(ch);//A
//		ch++;
//		System.out.println(ch);//B
		
		int a=11, b=22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		
		int i=0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);
		
		 char ch = 'A';
		 for(ch = 'A';ch<='Z';ch++) {
			 System.out.print(ch + " ");
		 }
		 System.out.println();
			 char e = 'a';
			 for(e='a';e<='z';e++) {
				 System.out.print(e + " ");
		 }
	}
}
