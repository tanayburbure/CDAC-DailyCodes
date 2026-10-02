package wordthread;

public class RunThread {

	public static void main(String[] args) {
		Thread t1 = new ThreadOne();
		Thread t2 = new ThreadTwo();
		
		t1.start();
		t2.start();

	}

}
