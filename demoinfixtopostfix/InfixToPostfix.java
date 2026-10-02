package demoinfixtopostfix;

import java.util.Stack;

public class InfixToPostfix {
	public int precedence(char ch) {
		switch (ch) {
		
		case '/' :
		case '*' : 
			return 2;
		case '+' :
		case '-' :
			return 1;
		}
		return -1;
	}
	public void InfixPostfix(String exp) {
		Stack<Character> ctr = new Stack<>();
		StringBuilder str = new StringBuilder();
		
		for(char ch : exp.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				str.append(ch);
			}
			else if(ch == '(') {
				ctr.push(ch);
			}
			else if(ch == ')') {
				while(!ctr.isEmpty() && ctr.peek() != '(') {
					str.append(ctr.pop());
				}
				ctr.pop();
			}else {
				while(!ctr.isEmpty() && ctr.peek() != ')' && precedence(ctr.peek()) >= precedence(ch)) {
					str.append(ctr.pop());
				}
				ctr.push(ch);
			}
		}
		while(!ctr.isEmpty()) {
			str.append(ctr.pop());
		}
		System.out.println(str.toString());
	}
	public static void main(String[] args) {
		InfixToPostfix ff = new InfixToPostfix();
		String exp = "(A+B)*(C-D)";
		ff.InfixPostfix(exp);
	}
}