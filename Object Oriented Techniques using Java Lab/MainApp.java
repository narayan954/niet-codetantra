package q11284;

interface Car {
  String getName();
  int getMaxSpeed();

  default void applyBreak() {
    System.out.println("Applying break on" + getName());
  }

  static Car getFastestCar(Car car1, Car car2) {
    if (car1.getMaxSpeed() < car2.getMaxSpeed()) {
      return car2;
    } else {
      return car1;
    }
  }
}

class BMW implements Car {

  String carName;
  int maxSpeed;

  public BMW(String name, int maxSpeed) {
    this.carName = name;
    this.maxSpeed = maxSpeed;
  }

  public String getName() {
    return this.carName;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }
}

class Audi implements Car {

  String carName;
  int maxSpeed;

  public Audi(String name, int maxSpeed) {
    this.carName = name;
    this.maxSpeed = maxSpeed;
  }

  public String getName() {
    return this.carName;
  }

  public int getMaxSpeed() {
    return this.maxSpeed;
  }
}

public class MainApp {

  public static void main(String args[]) {
    BMW bmw = new BMW(args[0], Integer.parseInt(args[1]));
    Audi audi = new Audi(args[2], Integer.parseInt(args[3]));
    System.out.println(
      "Fastest car is : " + Car.getFastestCar(bmw, audi).getName()
    );
  }
}
