package q10896;

public class FibonacciSeries {

  public static void main(String[] args) {
    int a = 0, b = 1, n;
    n = Integer.parseInt(args[0]);
    System.out.print(a);
    System.out.print(" " + b);
    while (b + a < n) {
      int temp = b;
      b = b + a;
      a = temp;
      System.out.print(" " + b);
    }
  }
}
