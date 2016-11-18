//인스턴스와 레퍼런스
package step08;

public class Student {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  Student(String name, String email, String tel, int age, boolean working) {
  this.name = name;
  this.email = email;
  this.tel = tel;
  this.age = age;
  this.working = working;
  }

  void printStudent() {
    System.out.printf("%s, %s, %s, %d, %b\n",
    this.name, this.email, this.tel, this.age, this.working);
  }
}
