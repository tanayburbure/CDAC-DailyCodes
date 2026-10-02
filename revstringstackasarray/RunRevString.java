package revstringstackasarray;
import java.util.*;

public class RunRevString {
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		for(int i=0 ; i<str.length() ; i++) {
			rs.push(str.charAt(i));
		}
		
		System.out.println("Reversed String : ");
		for(int i=0 ; i<str.length() ; i++) {
			System.out.print(rs.pop());
		}
	}
}
