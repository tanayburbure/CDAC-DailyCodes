package infixtoprefix;

import java.util.Stack;

public class InfixPrefix {
	public int precedence(char ch) {
		switch (ch) {
			case '*':
			case '/':
				return 2;
			case '+':
			case '-':
				return 1;
		}
		return -1;
	}
	public String infixToPostfix(String str) {
		Stack<Character> st = new Stack<Character>();
		StringBuilder res = new StringBuilder();

		for(char ch : str.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				res.append(ch);
			}
			else if(ch == '(') {
				st.push(ch);
			}
			else if(ch == ')') {
				while(!st.isEmpty() && st.peek() != '(' ) {
					res.append(st.pop());
				}
				st.pop();
			}
			else {
				while(!st.isEmpty() && st.peek() != '(' && precedence(st.peek()) >= precedence(ch)) {
					res.append(st.pop());
				}
				st.push(ch);
			}
		}
		while(!st.isEmpty()) {
			res.append(st.pop());
		}
		
		return res.toString();
	}
	
	public String infixToPrefix(String str) {
		StringBuilder reversed = new StringBuilder(str).reverse();
		for(int i=0 ; i<str.length(); i++) {
			if(reversed.charAt(i) == '(') {
				reversed.setCharAt(i, ')');
			}
			else if(reversed.charAt(i) == ')') {
				reversed.setCharAt(i, '(');
			}
		}
		String postfix = infixToPostfix(reversed.toString());
		
		return new StringBuilder(postfix).reverse().toString();
	}
	
}
