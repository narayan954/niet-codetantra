package q11075;

import java.util.*;

public class CountOfTwoNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements in the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the arg1 element:");
    int arg1 = sc.nextInt();
    System.out.println("Enter the arg2 element:");
    int arg2 = sc.nextInt();
    boolean result = compareCountOf(arr, arg1, arg2);
    System.out.println(result);
  }

  public static boolean compareCountOf(int[] arr, int arg1, int arg2) {
    int c1 = 0, c2 = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arg1 == arr[i]) c1 += 1;
      if (arg2 == arr[i]) c2 += 1;
    }
    if (c1 > c2) return true; else return false;
  }
}

public class CountOfTwoNumbersMain {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no of elements in the array:");
    int n = s.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter elements in the array seperated by space:");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Enter the arg1 element:");
    int arg1 = s.nextInt();
    System.out.println("Enter the arg2 element:");
    int arg2 = s.nextInt();
    CountOfTwoNumbers cNum = new CountOfTwoNumbers();
    boolean result = cNum.compareCountOf(arr, arg1, arg2);
    System.out.println(result);
  }
}
