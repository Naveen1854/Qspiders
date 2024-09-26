package instanceOf;

class Animals {}
class Dogs extends Animals {
    void bark() {
        System.out.println("Woof!...");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        Animals myAnimals = new Dogs();

        // Use instanceof to safely cast
        if (myAnimals instanceof Dogs) {
            Dogs myDogs = (Dogs) myAnimals; // Safe cast
            myDogs.bark(); // Calls the bark method
        }
    }
}

