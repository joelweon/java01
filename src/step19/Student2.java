package step19;

public class Student2 implements java.io.Serializable {
  String name;
  int age;
  boolean working;

  public Student2() {}

  public Student2(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override 
  public String toString() {
    return String.format("%s, %d, %b\n", this.name, this.age, this.working);
  }
}