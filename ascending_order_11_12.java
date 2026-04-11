//given an integer A.find and return first positive A integers in ascending order conataining only 1,2,3 as digits
//example A=5 output: 1,2,3,11,12
//take input from user and print the output
//initialize queue with 1,2,3 
//repeat A times: remove front element temp from queue and add temp to result list. then add temp*10+1, temp*10+2, temp*10+3 to the queue
import java.util.*;
public class ascending_order_11_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer A: ");
        int A = sc.nextInt();
        List<Integer> result = findFirstPositiveIntegers(A);
        System.out.println("First " + A + " positive integers in ascending order containing only 1, 2, 3 as digits: " + result);
        sc.close();
    }
    public static List<Integer> findFirstPositiveIntegers(int A) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (result.size() < A) {
            int temp = queue.poll();
            result.add(temp);
            queue.add(temp * 10 + 1);
            queue.add(temp * 10 + 2);
            queue.add(temp * 10 + 3);
        }
        return result;
    }
}