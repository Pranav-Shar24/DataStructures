package ds.CircularLinkedList;

public class App {

	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.insertFirst(100);
		circularLinkedList.insertFirst(90);
		circularLinkedList.insertFirst(80);
		circularLinkedList.insertFirst(70);
		circularLinkedList.insertFirst(60);
		circularLinkedList.insertFirst(50);
		circularLinkedList.displayList();
		circularLinkedList.insertLast(34);
		circularLinkedList.displayList();
		circularLinkedList.deleteFirst();
		circularLinkedList.displayList();
		circularLinkedList.deleteFirst();
		circularLinkedList.displayList();
	}
}
