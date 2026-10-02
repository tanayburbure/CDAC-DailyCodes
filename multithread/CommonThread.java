package multithread;

import java.util.ArrayList;

public class CommonThread extends Thread{
	ArrayList<Integer> primes;
	ArrayList<Integer> fibo;
	
	CommonThread(ArrayList<Integer> primes , ArrayList<Integer> fibo) {
		this.primes = primes ;
		this.fibo = fibo ;
	}
	
	public void run() {
		System.out.println("Common Numbers : ");
		for(int number : primes) {
			if(fibo.contains(number)) {
				System.out.println(number+" ");
			}
		}
	}
	
}
