//write a program to find the sum of column elements of a matrix
import java.util.Scanner;
public class column_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] columnSums = new int[cols];
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                columnSums[j] += matrix[i][j];
            }
        }
        System.out.println("The sum of column elements of the matrix is:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSums[j]);
        }
    }
}



