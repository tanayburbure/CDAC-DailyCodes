package multithread;

import java.util.ArrayList;

public class PThread extends Thread {
	ArrayList<Integer> primes = new ArrayList<>();
	public void run() {
		
		for(int i=2 ; i<=1000 ;i++) {
			boolean isPrime = true;
			
			for(int j=2 ; j<= i/2 ;j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primes.add(i);
			}
		}
		System.out.println("Prime numbers : ");
		System.out.println(primes);
	}
}
