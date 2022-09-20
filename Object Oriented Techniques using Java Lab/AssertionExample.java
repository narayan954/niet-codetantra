//program to implement the concept of Assertions in JAVA programming language.
//use command prompt for enabling assertions and compilation can be done using cmd
package q122;

import java.util.Scanner;

class AssertionExample {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int value = scanner.nextInt();
    assert value >= 18 : " Not valid";
    System.out.println("value is " + value);
  }
}
