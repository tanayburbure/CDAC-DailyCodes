package balanceunbalance;

public class RunBal {
	public static void main(String[] args) {
		CheckBal cb = new CheckBal();
		String str = "((a+b)*c" ;
		boolean bal = true;
		
		for(int i=0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if( ch =='(' || ch == '[' || ch == '{') {
				cb.push(str.charAt(i));
			}
			else if(ch == ')' || ch == ']' || ch == '}' ) {
				if(cb.isEmpty()) {
					bal = false;
					break;
				}
				char s = cb.pop();
				if( ch == '(' && s != ')' ||
					ch == '[' && s != ']' ||
					ch == '{' && s != '}' ) {
					bal = false;
					break;
				}
			}
		}
		if(!cb.isEmpty()) {
			bal = false;
		}
		if(bal) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}
}
