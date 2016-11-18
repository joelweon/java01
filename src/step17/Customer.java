package step17;

public class Customer {
  private String name;
  private int age;
  private boolean gender;

  public Customer() {}

  public Customer(String name, int age, boolean gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setage(int age) {
    if (age < 0 || age > 130) {
      throw new RuntimeException("나이가 유효하지 않습니다.");
    }
    this.age = age;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public String getName() {return this.name;}
  public int getage() {return this.age;}
  public boolean isGender() {return this.gender;}

  @Override
  public String toString() {
    return this.name + "," + this.age + "," + this.gender;
  }
}
