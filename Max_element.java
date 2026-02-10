//Question:- Count no. of elements having at least 1 element greater than itself
//Eg-[24,39,49,-2,16,7] Count-5
//Observation- For every max element there won't be any element greater than itself
//Pseudocode- 1)Iterate and get the max element in the array 2)Iterate and count no. of element which are not equal to the max
 
//Code:-
import java.util.Scanner;
public class Max_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0 ; i<n ; i++);
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i]>max)
            {   
                max=arr[i];
            }       

        }
        int count=0;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]!=max)
            {
                count++;
            }
        }
        System.out.println("Count of elements having at least 1 element greater than itself is: "+count);
    }
}
