package step07;

public class Exam059_4 {
  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }

  static void init(Student student, String name, String email, String tel, int age, boolean working) {
    student.name = name; //레퍼런스.변수명
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
  }

  public static void main(String[] args) {
    Student[] arr = new Student[3];

    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();

    init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    init(arr[2],"유관순", "yoo@test.com", "111-1113", 40, true);

    for(Student student : arr) {
      printStudent(student);
    }
  }
}
