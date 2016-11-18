package step07;

public class Exam059_5 {

  public static void main(String[] args) {
    Student2[] arr = new Student2[3];


    arr[0] = new Student2();
    arr[1] = new Student2();
    arr[2] = new Student2();

    Student2.init(arr[0], "홍길동", "hong@test.com", "111-1111", 20, true);
    Student2.init(arr[1], "임꺽정", "leem@test.com", "111-1112", 30, false);
    Student2.init(arr[2],"유관순", "yoo@test.com", "111-1113", 40, true);


    for(Student2 student : arr) {
      Student2.printStudent(student);
    }


  }
}
