package balanceunbalance;

public class CheckBal implements StackADT{
		char[] arr = new char[30];
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
		
		public void disp() {
			for(int i=0 ; i<arr.length ;i++) {
				System.out.print(arr[i]);
			}
		}

}
