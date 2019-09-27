package ds.linkedList;

public class App {

	public static void main(String[] args) {
			Node nodeA = new Node();
			nodeA.data=4;
			
			Node nodeB = new Node();
			nodeB.data=3;
			
			Node nodeC = new Node();
			nodeC.data=7;
			
			Node nodeD = new Node();
			nodeD.data=8;
			
			nodeA.next=nodeB;
			nodeB.next=nodeC;
			nodeC.next=nodeD;
			
			
			System.out.println(nodeA + " " + nodeB +" "+ nodeC+" "+nodeD + "\n");
			
			System.out.println("Count: " +listLength(nodeA));
	}

	private static int listLength(Node Gnode) {
		// TODO Auto-generated method stub
		int count=0;
		Node currentNode = Gnode;
		while(currentNode!=null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

}
