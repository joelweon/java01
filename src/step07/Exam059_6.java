package step07;

public class Exam059_6 {

  public static void main(String[] args) {
    Student3[] arr = new Student3[3];

    arr[0] = new Student3();
    arr[1] = new Student3();
    arr[2] = new Student3();

    arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1].init("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2].init("유관순", "yoo@test.com", "111-1113", 40, true);


    for(Student3 student : arr) {
      student.printStudent();
    }


  }
}
