package revdigits;

public class ReverseNumbers implements StackADT{
	int[] arr = new int[5];
	int top = -1;
	
	@Override
	public void push(int num) {
		if(!isFull()) {
			arr[++top] = num ;
		}
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == arr.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			return arr[top--];
		}
		return 0;
	}

}
