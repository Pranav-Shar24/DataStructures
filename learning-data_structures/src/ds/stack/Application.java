package ds.stack;

public class Application {

	public static void main(String[] args) {
		Stack theStack = new Stack(4);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(90);
		theStack.push(100);
		
		while(!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}
	}

}
