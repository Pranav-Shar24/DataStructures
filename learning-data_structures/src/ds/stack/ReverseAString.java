package ds.stack;

public class ReverseAString {

	private int maxSize;
	private char [] stackArray;
	private int top;
	
	public ReverseAString(char[] maxSize) {
		this.maxSize=maxSize.length;
		this.stackArray = new char[maxSize.length];
		this.top=-1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (maxSize-1 ==top);
	}
	
	public void push(char str) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top ++;
			stackArray[top] = str;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Empty");
			return '0';
		}else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public char peek() {
		return stackArray[top];
	}
}
