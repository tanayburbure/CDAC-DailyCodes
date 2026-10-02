package infixtoprefix;

public class RunInfix {

	public static void main(String[] args) {
		InfixPrefix inf = new InfixPrefix();
		
		String str = "(A+B)*(C-D)";
		
		System.out.println("Prefix : "+inf.infixToPrefix(str));

	}

}
