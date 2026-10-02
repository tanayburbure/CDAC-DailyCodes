package circularqueue;
import java.util.Scanner;

public class RunCircleQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Queue size : ");
		int size = sc.nextInt();
		CircularQueue cq = new CircularQueue(size);
		int choice;
		do {
			System.out.println("____QUEUE MENU____");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. display");
			System.out.println("5. IsEmpty");
			System.out.println("6. IsFull");
			System.out.println("7. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter value : ");
				int val = sc.nextInt();
				cq.enqueue(val);
				break;
			case 2: 
				cq.dequeue();
				break;
			case 3: 
				cq.peek();
				break;
			case 4: 
				cq.disp();
				break;
			case 5: 
				System.out.println("Is Empty : "+cq.isEmpty());
				break;
			case 6:
				System.out.println("Is Full : "+cq.isFull());
				break;
			case 7: 
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice...");
			}
		}while(choice != 7);
		
		sc.close();
	}
}
