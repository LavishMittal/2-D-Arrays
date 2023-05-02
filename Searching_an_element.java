import java.security.Key;
import java.util.*;

public class Searching_an_element {
    
    public static boolean Search(int arr[][], int Key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == Key){
                    System.out.println("key found at (" + i + "," + j +  ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]) {
        int arr[][] = new int[3][3];

        int n = arr.length,  m = arr[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {        // n = number of rows
            for (int j = 0; j < m; j++) {    // m = number of columns
                arr[i][j] = sc.nextInt();                
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Search(arr, 75);
    }
    
}
