package finalKeyword;

public class FinalParameters {
	public void printmessage(final String message) {
	// message = "New message"; // This line would cause a compile-time error	
	System.out.println(message);
	}

	public static void main(String[] args) {
		FinalParameters fp = new FinalParameters();
		fp.printmessage("Hello world!..");

	}

}
