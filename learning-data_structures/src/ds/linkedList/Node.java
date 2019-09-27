package ds.linkedList;

public class Node {

	 int data;
	 Node next = null;
	 
	@Override
	public String toString() {
		return String.format("Node [data=%s, next=%s]", data, next);
	};

	 
}

// self refer class or recursive class