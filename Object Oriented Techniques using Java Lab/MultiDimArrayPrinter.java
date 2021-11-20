package q10946;
import java.util.Scanner;
public class MultiDimArrayPrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter Number of columns: ");
        int columns = s.nextInt();
        int[][] int2DArr = new int [rows][columns];
        for (int i=0; i<rows;i++){
            System.out.print("Enter row " + (i + 1) + ": ");
            for(int j =0; j<columns;j++){
                int2DArr[i][j] = s.nextInt();
            }
        }
        for (int[] arr : int2DArr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
