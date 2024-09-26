package TypeCasting;									
//primitive datatypes 2 types 														
//1.widening	2.narrowing														
//byte		-	 1
//short		- 	 2
//int		-	 4
//long		-	 8
//float		-	 4
//double	-	 8
//char		-	 2
//boolean 	-	 1	not possible
public class Demo {																			
	public static void main(String[] args) {			
		int a = 54;		//widening converting small datatype to large								
		long l = a;
		System.out.println(a);
		System.out.println(l);
		
		short s = 2345;
		int i = s;			//widening converting small datatype to large
		System.out.println(s);
		System.out.println(i);
		
		byte b = 34;
		short h = b;		//widening converting small datatype to large
		System.out.println(b);
		System.out.println(h);
	}													
}
