package stacks;

public interface StackADT {
	public void push(int num);
	public boolean isEmpty();
	public boolean isFull();
	public int pop();
	public int peak();
}
