package demorevint;

public class Run {
	public static void main(String[] args) {
		RevInteger en = new RevInteger();
		int num = 90547;
		int divisor = 1;
		
		int temp = num;
		while(temp >= 10) {
			divisor *= 10;
			temp /= 10;
		}
		
		while(divisor>0) {
			en.push(num/divisor);
			num = num % divisor;
			divisor /= 10;
		}
		
		while(!en.isEmpty()) {
			System.out.print(en.pop());
		}
	}
}
