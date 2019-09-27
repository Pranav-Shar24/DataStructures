package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue que = new Queue(5);
		que.insert(4);
		que.insert(2);
		que.insert(3);
		que.insert(4);
		que.insert(5);
		que.view();
	}
}
