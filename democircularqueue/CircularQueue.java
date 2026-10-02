package democircularqueue;

public class CircularQueue {
	int size = 5;
	int[] arr = new int[size];
	int front = -1;
	int rear = -1;
	public boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if((rear+1) % size == front) {
			return true;
		}
		return false;
	}
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue Overflow");
			return;
		}
		if(front == -1) {
			front = 0;
		}
		rear = (rear+1) % size;
		arr[rear] = val;
		System.out.println(val+" Inserted ");
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println(arr[front]+" Removed");
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front+1) % size;
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		System.out.println("Front element : "+arr[front]);
	}
	public void disp() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		int i = front;
		while(true) {
			System.out.print(arr[i]+" ");
			if(i == rear) {
				break;
			}
			i = (i+1) % size;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CircularQueue cc = new CircularQueue();
		
		cc.enqueue(44);
		cc.enqueue(55);
		cc.enqueue(66);
		cc.enqueue(77);
		cc.enqueue(88);
		cc.enqueue(99);
		System.out.println("Queue : ");
		cc.disp();
		cc.peek();
		cc.dequeue();
		System.out.println("Queue : ");
		cc.disp();
	}
}
