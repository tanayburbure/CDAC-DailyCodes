package stacks;

public class RunStack {

	public static void main(String[] args) {
		StackArray st = new StackArray();
		
		st.peak();
		st.pop();
		
		
		st.push(14);
		st.push(10);
		st.push(60);
		st.push(47);
		st.push(74);
		st.push(6);

		System.out.println("\nThe stack after pushing");
		st.disp();
		
		st.push(70);

		System.out.println("\nThe top value of Stack is : "+st.peak());
		System.out.println("Poping from the stack : "+st.pop());
		System.out.println("Poping from the stack : "+st.pop());
		
		System.out.println("\nThe stack after poping an element : ");
		st.disp();
		
		
	}

}
