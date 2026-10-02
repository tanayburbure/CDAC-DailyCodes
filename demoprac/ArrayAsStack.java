package demoprac;

public class ArrayAsStack implements StackADT{
	int[] arr = new int[5];
	int top = -1;
	
	@Override
	public void push(int num) {
		if(!isFull()) {
			arr[++top] = num;
			System.out.println(num+" Element Added");
		}else {
			System.out.println("Stack Overflow");
		}
	}
	
	@Override
	public void pop() {
		if(!isEmpty()) {
			System.out.println("Element Removed  : "+arr[top--]);
		}else {
			System.out.println("Stack Underflow");
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
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}else {
			System.out.println("Stack Underflow");
			return -1;
		}
		
	}
	public void disp() {
		System.out.println("Stack : ");
		for(int i = arr.length-1 ; i>=0 ;i--) {
				System.out.print(arr[i]+" ");
			
		}
	}
}
