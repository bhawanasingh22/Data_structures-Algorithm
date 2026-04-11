//write a program that implements a queue using array.that queue would implement the following operations: enqueue, dequeue, peek, isEmpty, isFull in a menu driven program by user input. The queue should have a maximum size of 5 elements. The program should allow the user to perform these operations until they choose to exit.
import java.util.Scanner;
public class queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    System.out.println("Dequeued element: " + queue.dequeue());
                    break;
                case 3: 
                    System.out.println("Front element (peek): " + queue.peek());
                    break;
                case 4:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Is queue full? " + queue.isFull());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);  
    }
}
