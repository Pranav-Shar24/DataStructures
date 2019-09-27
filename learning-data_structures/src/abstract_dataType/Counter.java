package abstract_dataType;

public class Counter {

	private String name;
	private int value;
	
	public Counter(String name) {
		this.name = name;
	}
	
	public void increment() {
		value++;
	}
	
	public int getCurrentValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.format("Counter [name=%s, value=%s]", name, value);
	}
	
	
	
}
