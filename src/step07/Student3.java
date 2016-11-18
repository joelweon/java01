package step07;

public class Student3 {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  void printStudent() {
    System.out.printf("%s, %s, %s, %d, %b\n",
    this.name, this.email, this.tel, this.age, this.working);
  }

  void init(String name, String email, String tel, int age, boolean working) {

    this.name = name; //레퍼런스.변수명
    this.email = email;
    this.tel = tel;
    this.age = age;
    this.working = working;

  }

}
//관련 있는 메소드 끼리 묶어 놓는 것이 유지보수에 좋다.
