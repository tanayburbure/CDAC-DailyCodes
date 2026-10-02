package multithread;

import java.util.ArrayList;

public class FThread extends Thread{
	ArrayList<Integer> fibo = new ArrayList<Integer>();
	
	public void run() {
		int a = 0 ;
		int b = 1 ;
		
		while(a<1000) {
			fibo.add(a);
			int c = a + b;
			a = b ;
			b = c ;
		}
		
		System.out.println("Fibonacci Sequence : ");
		System.out.println(fibo);
	}
}
