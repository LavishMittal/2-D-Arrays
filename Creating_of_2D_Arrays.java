import java.util.*;

public class Creating_of_2D_Arrays{

    public static void main(String args[]) {

        int TwoDArray[][] = new int[3][3];

        int n = TwoDArray.length,  m = TwoDArray[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {        // n = number of rows
            for (int j = 0; j < m; j++) {    // m = number of columns
                TwoDArray[i][j] = sc.nextInt();                
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}