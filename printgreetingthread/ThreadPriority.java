package printgreetingthread;

public class ThreadPriority {
		public static void main(String[] args) {
			MyThread t1 = new MyThread();
			MyThread t2 = new MyThread();
			
			t1.setName("First");
			t2.setName("Second");
			
			t1.setPriority(3);
			t2.setPriority(8);
			
			System.out.println("t1 Thread Priority : "+t1.getPriority());
			t1.start();
			
			System.out.println("t2 Thread Priority : "+t2.getPriority());
			t2.start();
		}
	
}


class MyThread extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("Thread Name : "+t.getName());
		System.out.println("Thread Priority : "+t.getPriority());
	}
}