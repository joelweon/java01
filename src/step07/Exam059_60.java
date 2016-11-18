package step07;

public class Exam059_60{
public static void main(String[] args) {

  Student[] arr = new Student[3];

  arr[0] = new Student();
  arr[1] = new Student();
  arr[2] = new Student();

  init("홍길동", "hong@test.com", "1111-1111", 20, true, arr[0]);
  init("임꺽정", "leem@test.com", "1111-1111", 30, false, arr[1]);
  init("유관순", "you@test.com", "1111-1111", 40, true, arr[2]);

  for (Student student : arr) {
    printStudent(student);
  }
}

static void init(String name, String email,
                 String tel, int age, boolean working, Student student) {
  student.name = name;
  student.email = email;
  student.tel = tel;
  student.age = age;
  student.working = working;
  student.name = name;
}

static void printStudent(Student student) {
  System.out.printf("%s, %s, %s, %d, %b\n",
  student.name, student.email, student.tel, student.age, student.working);
}
}
