import java.util.*;

public class SmallestandLargestNum {

    public static void Search(int matrix[][]){
        
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Largest = Math.max(matrix[i][j], Largest);
                Smallest = Math.min(matrix[i][j], Smallest); 
            }
        }
        System.out.println("Largest Number is : " + Largest);
        System.out.println("Smallest Number is : " + Smallest);
    } 
    public static void main(String[] args) {

        int matrix[][] = new int [3][3];  

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }  

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Search(matrix);
    }
}
