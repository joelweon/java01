package step07;

public class Student2 {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  static void printStudent(Student2 student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }

  static void init(Student2 student, String name, String email, String tel, int age, boolean working) {
//파라미터로 인스턴스 주소르 받아야만 했다!
    student.name = name; //레퍼런스.변수명
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
//스태틱이 붙은 메서드는 클래스 메서드 or 스태틱 메서드
  }

}
//관련 있는 메소드 끼리 묶어 놓는 것이 유지보수에 좋다.
