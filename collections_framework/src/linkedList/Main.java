package linkedList;

class Node {
	int data;
	Node next;

	// Constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	// Add a new node at the start of the LinkedList
	public void addFirst(int data) {
		Node newNode = new Node(data); // Create a new node
		newNode.next = head;           // Link the new node to the current head
		head = newNode;                // Make the new node the new head
	}

	// Display the LinkedList
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Adding elements at the beginning
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		
		// Display the LinkedList
		list.display();  // Output: 30 -> 20 -> 10 -> null
	}
}
