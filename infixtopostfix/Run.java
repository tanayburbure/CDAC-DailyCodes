package infixtopostfix;

public class Run {

	public static void main(String[] args) {
		InfixPostfix inf = new InfixPostfix();
		String str = "((A+B)*C-D)*E";
		
		String res = inf.InfixToPostfix(str);
		System.out.println("Postfix : "+res);
	}

}
