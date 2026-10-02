package multithread;

public class DemoMultiThreads {

	public static void main(String[] args) throws Exception {
		PThread pt = new PThread();
		FThread ft = new FThread();
		CommonThread ct = new CommonThread(pt.primes, ft.fibo);
		
		pt.start();
		pt.join();
		ft.start();
		ft.join();
		ct.start();
		ct.join();

	}

}
