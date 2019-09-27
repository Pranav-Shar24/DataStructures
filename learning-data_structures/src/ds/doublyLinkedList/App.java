package ds.doublyLinkedList;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayForward();
		System.out.println();
		theList.displayBackwards();
		
		theList.deleteFirst();
		theList.deletekey(11);
		theList.deleteLast();
		
		System.out.println();
		theList.displayForward();
		
		theList.insertAfter(44, 100);
		theList.insertAfter(33, 99);
		
		System.out.println();
		theList.displayForward();
		System.out.println();
		theList.displayBackwards();
	}

}
