package printgreetingthread;

public class Greeting {

	public static void main(String[] args) {
		GoodMorning gm = new GoodMorning();
		Welcome wl = new Welcome();
		
		gm.start();
		wl.start();
	}

}


class GoodMorning extends Thread{
	public void run() {
		for(int i = 0 ; i<10 ;i++) {
			System.out.println("Good Morning");
			}
		}
}


class Welcome  extends Thread{
	public void run() {
		for(int i = 0 ; i<10 ;i++) {
			System.out.println("Welcome");
		}
	}
}