package q11161;

public class Student {

  private String id;
  private String name;
  private int age;
  private char gender;

  public Student(String name, String rollNo, int age, char gender) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}

public class StudentMain {

  public static void main(String[] args) {
    Student st = new Student("2", "Lakshmi", 26, 'F');
    System.out.println("Good Job ! ");
  }
}
