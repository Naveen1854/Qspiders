package interfaces;

 interface Vehicle {
	default void start() {
		System.out.println("Starting");
	}
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car Starting");
	}
}
 class Execution{
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
	}
}