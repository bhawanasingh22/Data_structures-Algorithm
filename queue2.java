//write a program to implement queue using array using constructor name queue
import java.util.Scanner;
public class queue2 {
    int front, rear, capacity;
    int queue[];
    queue2(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
    void enqueue(int item) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        }
        else {            queue[rear] = item;
            rear++;
        }
    }
    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        else {            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }
    void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        else {            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the queue:");
        int capacity = sc.nextInt();
        queue2 q = new queue2(capacity);
        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue:");
                    int item = sc.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
