package queuemenu;
import java.util.*;

public class RunQueueMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Queue size : ");
		int size = sc.nextInt();
		QueueMenu qm = new QueueMenu(size);
		int choice;
		do {
			System.out.println("____QUEUE MENU____");
			System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Is Full");
            System.out.println("7. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            
            switch (choice) {
			case 1: {
				System.out.println("Enter value : ");
				int val = sc.nextInt();
				qm.enqueue(val);
				break;
			}
			case 2 :{
				qm.dequeue();
				break;
			}
			case 3 :{
				qm.peek();
				break;
			}
			case 4 :{
				qm.disp();
				break;
			}
			case 5 :{
				System.out.println("Is Empty : "+qm.isEmpty());
				break;
			}
			case 6 :{
				System.out.println("Is Full : "+qm.isFull());
				break;
			}
			case 7 :{
				System.out.println("Exiting...");
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}
            
		} while (choice != 7);
		sc.close();
	}

}
