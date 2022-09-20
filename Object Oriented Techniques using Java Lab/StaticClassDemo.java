package q11293;

class StaticClassDemo {

  public static class Static {

    int a, b;

    public Static(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public void getValues() {
      System.out.println("a1 = A [value = " + this.a + "]");
      System.out.println("a2 = A [value = " + this.b + "]");
    }
  }

  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter a number:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    Static s = new Static(a, b);
    s.getValues();
  }
}
