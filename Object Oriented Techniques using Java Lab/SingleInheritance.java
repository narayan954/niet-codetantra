class Example {

  void show(String a, String b) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter the " + a + " class string: ");
    String c = sc.nextLine();
    System.out.println(b + " class string is: " + c);
  }
}

public class SingleInheritance {

  public static void main(String[] args) {
    Example ob1 = new Example();
    ob1.show("first", "First");
    Example ob2 = new Example();
    ob2.show("second", "Second");
  }
}
