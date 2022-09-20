package q10894;

public class NumberPalindrome {

  public void isNumberPalindrome(int number) {
    int r, sum = 0, temp = number;

    while (number != 0) {
      r = number % 10;
      sum = (sum * 10) + r;
      number = number / 10;
    }
    number = temp;
    if (temp == sum) {
      System.out.println(number + " is a palindrome");
    } else {
      System.out.println(number + " is not a palindrome");
    }
  }
}

public class NumberPalindromeMain {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: java NumberPalindromeMain <number>");
      System.exit(-1);
    }
    try {
      int number = Integer.parseInt(args[0]);
      NumberPalindrome nPalindrome = new NumberPalindrome();
      nPalindrome.isNumberPalindrome(number);
    } catch (NumberFormatException nfe) {
      System.out.println(
        "Usage: java NumberPalindromeMain <number>\n\tage: an integer representing number"
      );
    }
  }
}
