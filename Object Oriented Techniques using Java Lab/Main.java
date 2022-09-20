package q116;

import java.util.Scanner;

public class Main {

  static void str(String a) {
    System.out.println("The entered string is: " + a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String n = sc.nextLine();
    str(n);
  }
}
