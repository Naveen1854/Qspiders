package abstraction;

public class Factory {
	public static Calculator option(int x) {
		if(x==1) {
			Calculator a1 = new Addition();		//upCasting
			return a1;
		}
		else if(x==2) {
			Calculator s1 = new Subtraction();
			return s1;
		}else {
			Calculator i1 = new Invalid();
			return i1;
		}
	}
}
