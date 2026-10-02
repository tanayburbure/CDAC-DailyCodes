package revdigits;
import java.util.*;

public class RunRevNums {
	public static void main(String[] args) {
		ReverseNumbers rn = new ReverseNumbers();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num ;
		int divisor = 1;
		
		while(temp >= 10) {
			divisor *= 10;
			temp /= 10;
		}
		
		while(divisor > 0) {
			rn.push(num/divisor);
			num = num % divisor;
			divisor /= 10;
		}
		
		while(!rn.isEmpty()) {
			System.out.print(rn.pop());
		}
	}
}
