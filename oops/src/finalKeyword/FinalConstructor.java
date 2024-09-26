package finalKeyword;

class BaseClass{
	//This is invalid and cause a compile-time error
	//public final BaseClass(){
	// System.out.println("Constructor in BaseClass");
	//}
public BaseClass(){
	System.out.println("Constructor in BaseClass");
	}
}

class DerivedClass extends BaseClass{
	public DerivedClass() {
		System.out.println("Constructor Inside DerivedClass");
	}
}

public class FinalConstructor {
	public static void main(String[] args) {
		new BaseClass();
		new DerivedClass();
	}
}

/*you can still create a DerivedClass which extends BaseClass,
and the constructors are used to initialize objects. 
The final keyword is not applicable to constructors
because the concept of "preventing override" 
doesn’t apply to constructors in the way it does to methods or classes.*/
