package step08;

public class Exam061_0 {
  static class Student {
           //인스턴스 변수
    String name;
    String email;
    String tel;
    int age;
    boolean working;
          //인스턴스 메서드
    static Student(String name, String email, String tel, int age, boolean working) {
    this.name = name;
    this.email = email;
    this.tel = tel;
    this.age = age;
    this.working = working;
    }

    static void printStudent() {
      System.out.printf("%s, %s, %s, %d, %b\n",
      this.name, this.email, this.tel, this.age, this.working);
    }
  }

  public static void main(String[] args) {
    Student[] arr = new Student[3];

    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2] = new Student("유관순", "yoo@test.com", "111-1113", 40, true);

    for(Student student : arr) {
      student.printStudent();
    }
  }
}
