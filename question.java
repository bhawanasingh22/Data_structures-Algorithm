//Given N array elements,check if there exists a pair (i,j) such that arr[i] + arr[j]=k where i!=j
//i and j are index value k is given sum 
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum k:");
        int k = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    found = true;
                   
                }
            }           
        }        if (found) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }   
}
