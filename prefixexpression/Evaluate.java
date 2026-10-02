package prefixexpression;
import java.util.Stack;

public class Evaluate {
	public int PreEvaluate(String str) {
		Stack<Integer> st = new Stack<>();
		
		for(int i = str.length()-1 ; i >= 0 ;i--) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)){
				st.push(ch - '0');
			} 
			else {
				int num1 = st.pop();
				int num2= st.pop();
				
				switch (ch) {
					case '+': {
						st.push(num1 + num2);
						break;
					}
					case '-': {
						st.push(num1 - num2);
						break;
					}
					case '*': {
						st.push(num1 * num2);
						break;
					}
					case '/': {
						st.push(num1 / num2);
						break;
					}
				}
			}
		}
		return st.pop();
	}
}