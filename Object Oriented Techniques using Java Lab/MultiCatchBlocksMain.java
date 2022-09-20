package q11331;

import java.util.Scanner;

public class MultiCatchBlocks {

  public void multiCatch(int[] arr, int index) {
    try {
      System.out.println(arr[index]);
      System.out.println(arr[index] / index);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero exception occurred");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bounds exception occurred");
    } catch (Exception e) {
      System.out.println("Exception occurred");
    }
  }
}

public class MultiCatchBlocksMain {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no of elements in the array:");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements in the array seperated by space:");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Enter the index element:");
    int x = s.nextInt();

    MultiCatchBlocks mb = new MultiCatchBlocks();
    mb.multiCatch(arr, x);
  }
}
