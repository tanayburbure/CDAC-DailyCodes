package queuemenu;

public class QueueMenu {
	private int arr[];
	private int front = -1;
	private int rear = -1;
	private int size;
	
	QueueMenu(int size){
		this.size = size;
		arr = new int[size];
	}
	public boolean isFull() {
		return rear == size -1 ;
	}
	public boolean isEmpty() {
		return front == -1;
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return ;
		}
		System.out.println("Front element : "+arr[front]);
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue Overflow");
			return ;
		}
		if(front == -1) {
			front = 0;
		}
		arr[++rear] = val ;
		System.out.println("Inserted in queue : "+val);
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println(arr[front++]+" Removed from the queue");
		
		if(front >  rear) {
			front = -1;
			rear = -1;
		}
	}
	public void disp() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println("Queue : ");
		for(int i=front ; i<=rear ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
