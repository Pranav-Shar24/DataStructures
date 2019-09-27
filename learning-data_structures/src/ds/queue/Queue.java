package ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front; // index position if the front elements
	private int rear;
	private int nCounts;

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.nCounts = 0;
	}

	public void insert(long ele) {
		if(rear == maxSize-1) {
			rear =-1;
		}
		rear++;
		queueArray[rear] = ele;
		nCounts++;
	}

	public long remove() // must remove the first element
	{
		long temp = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nCounts--;
		return temp;

	}

	public void view() {
		System.out.print("[");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print("]");
	}

	public long peekFront() {
		return queueArray[front];

	}

	public boolean isEmpty() {
		return (nCounts == 0);
	}

	public boolean isFull() {
		return (nCounts == maxSize);
	}

}

/// underlying container for stack and queue is Array
// Queue = First in First Out
// job queues -> print jobs, call center call management {FIFO}