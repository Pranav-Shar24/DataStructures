package abstract_dataType;

public class App {
	public static void main(String[] args) {
	Counter myCounter = new Counter("My Counter");
	myCounter.increment();
	myCounter.increment();
	myCounter.increment();
	myCounter.increment();
	myCounter.increment();
	System.out.println(myCounter.getCurrentValue());
	System.out.println(myCounter.toString());
	}
	
}
