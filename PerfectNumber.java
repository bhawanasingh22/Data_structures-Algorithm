//given an integer A,you have to find the Ath perfect number.
//A perfect number has following properties:
//it comprises of only 1 and 2
//the number of digits in a perfect number is even
//it is a palindrome number
//for example, 11, 22, 1122, 1221 are perfect numbers where 123,121,782,1 are not perfect numbers.
//take input from user and print the output
//first 5 perfect numbers are 11,22,1122,1221,1111
//algorithm:create a queue.insert "1" and "2" into the queue.
//insert "1"and "2"
//repeat A times: remove front element temp from queue and add temp to result list. then add temp+"1" and temp+"2" to the queue
//return last generated perfect number from result list
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");

        String temp = "";

        for (int i = 0; i < A; i++) {
            temp = q.poll();  

            q.add(temp + "1");
            q.add(temp + "2");
        }

        
        String result = temp + new StringBuilder(temp).reverse().toString();

        System.out.println(result);
    }
}
