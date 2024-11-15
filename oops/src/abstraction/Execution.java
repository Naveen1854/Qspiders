package abstraction;

public class Execution {
	public static void main(String[] args) {
		Calculator addition = Factory.option(1);
		addition.operation(20, 10);
		Calculator subtraction = Factory.option(2);
		subtraction.operation(20, 10);
		Calculator invalid = Factory.option(5);
		invalid.operation(10, 20);
	}
}
