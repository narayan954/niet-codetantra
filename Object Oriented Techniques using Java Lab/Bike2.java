class methodOverriding {

  void run() {
    System.out.println("Vehicle is running");
  }
}

class Bike extends methodOverriding {

  void run() {
    System.out.println("Bike is running safely");
  }
}

public class Bike2 {

  public static void main(String[] args) {
    methodOverriding ob1 = new methodOverriding();
    Bike ob2 = new Bike();
    ob1.run();
    ob2.run();
  }
}
