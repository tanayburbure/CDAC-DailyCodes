package demobalunb;

import java.util.Stack;

public class DemoBal {
	public static void main(String[] args) {
		String str = "[a+b*(c-d)]";
		Stack<Character> st = new Stack<>();
		boolean bal = true;
		for(int i=0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if( ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}
			else if(ch == ')' || ch == ']' || ch == '}'){
				if(st.isEmpty()) {
					bal = false;
					break;
			}
			else {
				char s = st.pop();
				if(ch == '(' && s != ')' || 
				   ch == '[' && s != ']' ||
				   ch == '{' && s != '}') {
						bal = false;
						break;
					}
				}
			}
		}
		if(!st.isEmpty()) {
			bal = true;
		}
		if(bal) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}
}
