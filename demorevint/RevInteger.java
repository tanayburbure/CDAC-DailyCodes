package demorevint;

public class RevInteger {
	int arr[] = new int[5];
	
	int top = -1;
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(top == arr.length -1) {
			return true;
		}
		return false;
	}
	public void push(int val) {
		if(!isFull()) {
			arr[++top] = val;
		}
	}
	public int pop() {
		if(!isEmpty()) {
			return arr[top--];
		}
		return -1;
	}
	public void disp() {
		for(int i = arr.length-1 ; i>=0 ;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
