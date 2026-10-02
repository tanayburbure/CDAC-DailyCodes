package demopost;
import java.util.Stack;

public class RunPostfix {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		String str = "-+52*34";
		
		for(int i=str.length()-1 ; i>=0 ;i--) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				st.push(ch - '0');
			}
			else {
				int num1 = st.pop();
				int num2 = st.pop();
				switch (ch) {
					case '+': {
						st.push(num1 + num2);
						break;
					}
					case '-' :{
						st.push(num1 - num2);
						break;
					}
					case '*':{
						st.push(num1 * num2);
						break;
					}
					case '/' : {
						st.push(num1 / num2);
						break;
					}
			    }
			}
		}
		System.out.println(st.pop());
	}
}
