package circularqueue;

public class CircularQueue {
	private int[] arr;
	private int front = -1;
	private int rear = -1;
	private int size ;
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	public boolean isFull() {
		return (rear+1) % size == front;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue Overflow");
			return ;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear+1) % size;
		arr[rear] = val ;
		System.out.println(val+" Inserted in the queue");
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println(arr[front]+" removed");
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front+1)% size;
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return ;
		}
		System.out.println("Front element : "+arr[front]);
	}
	public void disp() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println("Queue : ");
		int i = front;
		while(true) {
			System.out.print(arr[i]+ " ");
			if(i == rear) {
				break;
			}
			i = (i + 1) % size;
		}
		System.out.println();
	}
	
}
