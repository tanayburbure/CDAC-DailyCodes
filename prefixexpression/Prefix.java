package prefixexpression;

public class Prefix {

	public static void main(String[] args) {
		Evaluate ev = new Evaluate();

		String[] str = {
			    "+2*34",
			    "*+234",
			    "-*564",
			    "+/823",
			    "-+52*34",
			    "*-93+24",
			    "+*23/84",
			    "-7*23",
			    "/*832",
			    "+-94*25"
			     ,"+11*52"
			};
		
		for(String st : str) {
			int res = ev.PreEvaluate(st);
			System.out.println("Result  : "+res);
		}
	}

}
