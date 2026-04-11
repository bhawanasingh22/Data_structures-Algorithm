import java.util.Scanner;

class CircularQueue {
    int max = 5;
    int arr[] = new int[max];
    int front = -1;
    int rear = -1;

    // Enqueue operation
    void enqueue(int value) {
        // Check Full
        if ((rear + 1) % max == front) {
            System.out.println("Queue Overflow! Cannot insert.");
        } else {
            if (front == -1) { // first element
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            arr[rear] = value;
            System.out.println(value + " inserted into circular queue.");
        }
    }

    // Dequeue operation
    void dequeue() {
        // Check Empty
        if (front == -1) {
            System.out.println("Queue Underflow! Cannot delete.");
        } else {
            System.out.println(arr[front] + " deleted from circular queue.");

            if (front == rear) {
                // only one element
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
    }

    // Peek operation
    void peek() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is: " + arr[front]);
        }
    }

    // Display operation
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Circular Queue elements are:");

            int i = front;
            while (true) {
                System.out.println(arr[i]);
                if (i == rear) break;
                i = (i + 1) % max;
            }
        }
    }

    // isEmpty check
    void isEmpty() {
        if (front == -1) {
            System.out.println("Queue is EMPTY.");
        } else {
            System.out.println("Queue is NOT EMPTY.");
        }
    }

    // isFull check
    void isFull() {
        if ((rear + 1) % max == front) {
            System.out.println("Queue is FULL.");
        } else {
            System.out.println("Queue is NOT FULL.");
        }
    }
}

public class CircularQueueMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue cq = new CircularQueue();
        int choice, value;

        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    cq.enqueue(value);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.peek();
                    break;

                case 4:
                    cq.display();
                    break;

                case 5:
                    cq.isEmpty();
                    break;

                case 6:
                    cq.isFull();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
