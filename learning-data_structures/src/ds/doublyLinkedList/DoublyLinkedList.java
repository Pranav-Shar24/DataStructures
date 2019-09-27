package ds.doublyLinkedList;

public class DoublyLinkedList {

	private Node front;
	private Node rear;

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		this.front = null;
		this.rear = null;
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			rear = newNode;
		} else {
			front.previous = newNode;
		}

		newNode.next = front; // new node's next field will point to the old first
		this.front = newNode;

	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode; // assigning old last to new node
			newNode.previous = rear; //
		}
		this.rear = newNode;
	}

	/// assume a non empty list

	public Node deleteFirst() {
		Node temp = front;
		if (front.next == null) { // assuming there is only one item in the list
			rear = null;
		} else {
			front.next.previous = null; // the list first node will point to null
		}
		front = front.next; // we are assigning the reference of the node the old first node to the first
							// field in the linked list object
		return temp;
	}

	public Node deleteLast() {
		Node temp = rear;
		if (front.next == null) {
			front = null;
		} else {
			rear.previous.next = null;
		}
		rear = rear.previous;
		return temp;
	}

	public boolean insertAfter(int key, int data) {
		Node current = front; // we start from the beginning
		while (current.data != key) // as long as the key is not found in the particular node
		{
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;
		if (current == rear) {
			current.next = null;
			rear = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;

		return true;
	}

	public Node deletekey(int key) {
		Node current = front;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == front) {
			front = current.next;
		} else {
			current.previous.next = current.next;
		}
		if (current == rear) {
			rear = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}

	public void displayForward() {
		System.out.println("List[First --- > Last]");
		Node current = front;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

	public void displayBackwards() {
		System.out.println("List[Last --- > First]");
		Node current = rear;
		while (current != null) {
			current.display();
			current = current.previous;
		}
		System.out.println();
	}
}
