package infixtopostfix;

import java.util.Stack;

public class InfixPostfix {
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

	public String InfixToPostfix(String exp) {
		Stack<Character> cr = new Stack<>();
		StringBuilder res = new StringBuilder();
		
		for(char ch : exp.toCharArray()) {
			if(Character.isLetterOrDigit(ch)) {
				res.append(ch);
			}
			else if(ch == '(') {
				cr.push(ch);
			}
			else if(ch == ')') {
				while(!cr.isEmpty() && cr.peek() != '(') {
					res.append(cr.pop());
				}
				cr.pop();
			}
			else {
				while(!cr.isEmpty() &&
					cr.peek() != '(' && 
					precedence(cr.peek()) >= precedence(ch)) {
					res.append(cr.pop());
				}
				cr.push(ch);
			}
		}
		while(!cr.isEmpty()) {
			res.append(cr.pop());
		}
		return res.toString();
	}
}