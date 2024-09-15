package constructorChaining;

//super class
class Cars{
	String brand;
	double cost;
	String fuelType;
	String color;
	static int steering = 1;
	static int noOfWheels = 4;
	
	//constructor
	public Cars(String brand,double cost,String fuelType,String color) {
		this.brand=brand;
		this.cost=cost;
		this.fuelType=fuelType;
		this.color = color;
	}
} 

// sub class
class Mahindra extends Cars{
	double safetyRating;
	
	//constructor
	public Mahindra(String brand,double cost,String fuelType,String color,double safetyRating) {
		super(brand,cost,fuelType,color);
//		this(brand,cost,fuelType,color,safetyRating);
		this.safetyRating=safetyRating;
	}
	
	//method
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Cost: " + cost);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Color: " + color);
		System.out.println("steering:" + steering);
		System.out.println("noOfWheels: " + noOfWheels);
	}
}

// sub class
class Tata extends Cars{
	String breakingSystem;
	
	//constructor
	public Tata(String brand,double cost,String fuelType,String color,String breakingSystem) {
		super(brand,cost,fuelType,color);
		this.breakingSystem=breakingSystem;
	}
	
	//method
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Cost: " + cost);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Color: " + color);
		System.out.println("steering:" + steering);
		System.out.println("noOfWheels: " + noOfWheels);
	}
}


//driver class
public class SuperCon { 

	public static void main(String[] args) {
		
		System.out.println("Car Details:");
		System.out.println("---------------------");
		Mahindra mahindra = new Mahindra("Mahindra_Thar",200000.0,"Diesel_Engine","Black",4.5);
		mahindra.display();
		
		System.out.println("=====================");
		Tata tata = new Tata("Tata_Punch",1000000.0,"Petrol_Engine","Red","ABS");
		tata.display();
		System.out.println("=====================");
		Tata tata1 = new Tata("Tata_Nexon",1500000.0,"Diesel_Engine","Pure White","dual_ABS");
		tata1.display();
	}
}
