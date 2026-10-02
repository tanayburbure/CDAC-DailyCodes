package printgreetingthread;

public class SleepJoin {
	public static void main(String[] args) throws Exception {
		MThread t1 = new MThread();
		MThread t2 = new MThread();
		
		t1.setName("t1 Thread");
		t2.setName("t2 Thread");
		
		t1.start();
		t1.join();
		t2.start();
	}
}

class MThread extends Thread{
	public void run() {
		for(int i = 0 ; i<5 ;i++) {
			System.out.println(Thread.currentThread().getName()+ " : " + i);
			
			try{
				Thread.sleep(1000); //ms
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}