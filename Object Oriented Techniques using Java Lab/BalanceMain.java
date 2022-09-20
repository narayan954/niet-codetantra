package q10850;

public class BalanceCheck {

  public static void checkBalance(double balance) {
    if (balance < 1000) {
      System.out.println("Balance is low");
    } else {
      System.out.println("Sufficient balance");
    }
  }
}

public class BalanceMain {

  public static void main(String[] args) {
    double balance = Double.parseDouble(args[0]);
    BalanceCheck bc = new BalanceCheck();
    bc.checkBalance(balance);
  }
}
