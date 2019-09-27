package ds.stack;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top=-1;
	}
	
	public void push(long ele) {
		if(isFull()) {
			System.out.println("Stack is already full!!");
		}
		else {
			top ++;
			stackArray[top] = ele;
		}
		}
		
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return -1;
		}
		else {
			long old_Top = top;
			top--;
			return stackArray[(int) old_Top];	
		}
		
		
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (maxSize-1 == top);
	}
}
