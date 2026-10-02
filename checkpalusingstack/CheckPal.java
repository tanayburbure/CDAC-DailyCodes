package checkpalusingstack;

public class CheckPal implements StackADT{
	char[] arr = new char[20];
	int top = -1;

	@Override
	public void push(char ch) {
		if(!isFull()) {
			arr[++top] = ch;
		}
	}

	@Override
	public char pop() {
		if(!isEmpty()) {
			return arr[top--];
		}
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == arr.length-1) {
			System.out.println("Stacj=k Overflow");
			return true;
		}
		return false;
	}
}
