package checkpalusingstack;
import java.util.*;

public class RunPal {
	public static void main(String[] args) {
				CheckPal cp = new CheckPal();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string : ");
				String str = sc.nextLine();
				
				for(int i=0 ; i<str.length() ; i++) {
					cp.push(str.charAt(i));
				}
				
				StringBuilder str2 = new StringBuilder();
				
				for(int i=0 ; i<str.length() ; i++) {
					str2.append(cp.pop());
					
				}
				
				if(str.equals(str2.toString())) {
					System.out.println("Pallindrome");
				}else {
					System.out.println("Not Pallindrome");
				}
		}
}
