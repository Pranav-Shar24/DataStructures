package ds.SinglylinkedList;

public class App {
	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.display();
		singlyLinkedList.insertFirst(35);
		
		singlyLinkedList.insertFirst(15);
		singlyLinkedList.insertFirst(25);
		singlyLinkedList.insertFirst(45);
		singlyLinkedList.insertFirst(55);
		singlyLinkedList.display();
		singlyLinkedList.deleteFirst();
		singlyLinkedList.insertLast(100);
		singlyLinkedList.display();
		
		
	}
}
