package arrayList;
import java.util.*;

public class FindMaxandMin {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 7, 2, 9, 1, 6));
		//		int max = Collections.max(al);
		//		System.out.println("Max in ArrayList: " + max);
		//		int min = Collections.min(al);
		//		System.out.println("Min in ArrayList: " + min);

		int max = Integer.MIN_VALUE;
		for(Integer i : al) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("Max value in ArrayList: " + max);

		
		int min = Integer.MAX_VALUE;
		for(Integer i2 : al) {
			if(i2 < min) {
				min = i2;
			}	
		}
		System.out.println("Min value in ArrayList: "+ min);

	}
}
