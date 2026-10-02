package postfixexpression;

public class Postfix {
	public static void main(String[] args) {
		Evaluate ev = new Evaluate();
		
		String[] str = {"23*54*+",
				"23+5*",
				"52+83-*",
				"82/3-",
				"93/42*+",
				"84/2+",
				"62-34+*",
				"234*+",
				"82+5*6-"};
		
		for(String eves : str) {
			int res = ev.PostEvaluate(eves);
			System.out.println("Result : "+res);
		}
		
	}
}