package q11106;

import java.util.Scanner;

public class MultiplicationOfMatrix {

  public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
    if (matrix1[0].length != matrix2.length) return null;
    int arr[][] = new int[matrix1.length][matrix2[0].length];
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2[0].length; j++) {
        int sum = 0;
        for (int k = 0; k < matrix1[0].length; k++) {
          sum += matrix1[i][k] * matrix2[k][j];
        }
        arr[i][j] = sum;
      }
    }
    return arr;
  }
}

public class MultiplicationOfMatrixMain {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    MultiplicationOfMatrix multiplier = new MultiplicationOfMatrix();

    System.out.println("Matrix 1:");
    int[][] m1 = readMatrix(s);

    System.out.println("Matrix 2:");
    int[][] m2 = readMatrix(s);

    int[][] multi = multiplier.multiplication(m1, m2);

    if (multi == null) {
      System.out.println("Multiplication of matrices is not possible");
    } else {
      System.out.println("Multiplication of the two given matrices is:");
      for (int i = 0; i < multi.length; i++) {
        int c = multi[i].length;
        for (int j = 0; j < c; j++) {
          String spacer = j == c - 1 ? "\n" : " ";
          System.out.print(multi[i][j] + spacer);
        }
      }
    }
  }

  public static int[][] readMatrix(Scanner s) {
    System.out.print("Enter number of rows: ");
    int r = s.nextInt();
    System.out.print("Enter number of columns: ");
    int c = s.nextInt();
    int[][] m = new int[r][c];
    System.out.println("Enter " + c + " numbers separated by space");
    for (int i = 0; i < r; i++) {
      System.out.print("Enter row " + (i + 1) + ": ");
      for (int j = 0; j < c; j++) {
        m[i][j] = s.nextInt();
      }
    }
    return m;
  }
}
