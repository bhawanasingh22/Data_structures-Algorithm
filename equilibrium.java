//calculate the equilibrium count for the user input array using left sum and right sum and prefix array
import java.util.Scanner;

public class equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int pf[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        int Count = 0;

        for (int i = 0; i < n; i++) {
           
            int leftSum;
if (i == 0) {
    leftSum = 0;
} else {
    leftSum = pf[i - 1];
}

            int rightSum = pf[n - 1] - pf[i];

            if (leftSum == rightSum) {
                Count++;
                System.out.println(" index found at: " + i);
            }
        }

        System.out.println("Total Equilibrium: " + Count);

        
    }
}
