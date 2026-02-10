//You are given an integer array A
//You have to find the second largest element in the array or report that no such element exists.
import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   
        
        int max1=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        int max2=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }
        if (max2 == -1) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second largest element is: " + max2);
        }
    }
}