package constructors;

public class Car {
	String model;
	int year;
	
	public Car(String model,int year) {
		this.model=model;
		this.year=year;
	}
	
	//copy constructor
	public Car(Car otherCar) {
		this.model=otherCar.model;
		this.year=otherCar.year;
	}
	
	public void displayCarInfo() {
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Tesla", 2023);
		c1.displayCarInfo();
	}
	
}
