package stacks;

class StackArray implements StackADT{
	
	int top = -1;
	int[] stackarray = new int[6];
	
	@Override
	public void push(int num) {
		if(!isFull()) {
			stackarray[++top] = num;
		}
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
		if(top == stackarray.length-1) {
			System.out.println("Stack Overflow");
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			return stackarray[top--];
		}
		return -1;
	}

	@Override
	public int peak() {
		if(!isEmpty()) {
			return stackarray[top];
		}
		return -1;
	}
	
	public void disp() {
		for(int i = top ; i>=0 ; i--  ) {
			System.out.println(stackarray[i]);
		}
	}
}