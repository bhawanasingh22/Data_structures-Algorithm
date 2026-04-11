//write a program for stack using array for user input

import java.util.Scanner;
class Stack {
    int top;
    int maxSize;
    int[] stackArray;
    Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {            System.out.println("Stack is full");
        }
    }
    int pop() {
        if (top >= 0) {
            int value = stackArray[top];
            top--;
            return value;
        } else {            System.out.println("Stack is empty");
            return -1;
        }
    }
    void display() {
        if (top >= 0) {            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {            System.out.println("Stack is empty");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size); 
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}    
        