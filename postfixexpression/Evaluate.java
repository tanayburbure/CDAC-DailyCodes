package postfixexpression;
import java.util.Stack;

public class Evaluate {
	public int PostEvaluate(String str) {
		Stack<Integer> st = new Stack<>();
		
		for(int i=0 ; i >= str.length()  ;i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				st.push(ch - '0');
			}
			else {
				int num2 = st.pop();
				int num1 = st.pop();
				
				switch (ch) {
					case '+': {
						st.push(num1 + num2);
						break;
					}
					case '-':{
						st.push(num1 - num2);
						break;
					}
					case '*':{
						st.push(num1 * num2);
						break;
					}
					case '/':{
						st.push(num1 / num2);
						break;
					}
				}
			}
		}
		return st.pop();
	}
}
