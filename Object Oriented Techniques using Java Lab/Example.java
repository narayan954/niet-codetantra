package q24212;

public class Example {

  public static void main(String[] args) {
    String str = args[0];
    String res = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        res = res + str.charAt(i);
      }
    }
    System.out.println("The result is: " + res);
  }
}
