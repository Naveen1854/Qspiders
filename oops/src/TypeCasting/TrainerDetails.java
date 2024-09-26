package TypeCasting;

// Create a method which will return the specified trainer object:
class Trainer {
	String name;
	int id;
	String sub;
	double sal;
	public Trainer(String name, int id, String sub, double sal) {
		//		super();
		this.name = name;
		this.id = id;
		this.sub = sub;
		this.sal = sal;
	}
	public void details() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sub);
		System.out.println(sal);
	}
}
public class TrainerDetails{
	public static Trainer empDetails(String sub) {
		if(sub=="java") {
			Trainer t1 = new Trainer("Naveen",54,"core java",40000.0);
			return t1;
		}else if(sub=="sql") {
			Trainer t2 = new Trainer("Kiran",34,"sql",20000.0);
			System.out.println("--------------");
			return t2;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Trainer java = empDetails("java");
		java.details();
		Trainer sql = empDetails("sql");
		sql.details();
	}
}
