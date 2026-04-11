//write a program that implements a stack using array.that stack would implement the following operations: push, pop, peek, isEmpty, isFull in a menu driven program by user input. The stack should have a maximum size of 5 elements. The program should allow the user to perform these operations until they choose to exit.
import java.util.Scanner;
public class stack_operations {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    System.out.println("Popped element: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top element (peek): " + stack.peek());
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Is stack full? " + stack.isFull());
                    break;
                case 6:
                    System.out.println("Exiting...");`1
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}
