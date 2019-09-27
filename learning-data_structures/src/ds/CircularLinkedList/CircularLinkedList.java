package ds.CircularLinkedList;

public class CircularLinkedList {

	private Node front;
	private Node rear;

	public CircularLinkedList() {
		this.front = null;
		this.rear = null;
	}

	private boolean isEmpty() {
		return (front == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			rear = newNode;
		}

		newNode.next = front; // newNode ---> oldNode
		front = newNode; // firstPlace

	}

	public void insertLast(int data) {

		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			front = newNode;
		} else {
			rear.next = newNode; // the next value of the node will point to the new node
			rear = newNode; // the new node is created at the last of the list
		}
	}

	public int deleteFirst() {
		int temp = front.data;

		if (front.next == null) {
			rear = null;
		}

		front = front.next; // first will point to old's next value

		return temp;
	}

	public void displayList() {
		System.out.println("List { first --- > last }");
		Node current = front;
		while (current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}

}
