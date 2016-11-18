package step08;

public class Exam060_0 {

  public static void main(String[] args) {
    Student[] arr = new Student[3];

    //인스턴스를 생성할 떄 바로 내가 지정한 값으로 메모리를 설정하고 싶다.
    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "leem@test.com", "111-1112", 30, false);
    arr[2] = new Student("유관순", "yoo@test.com", "111-1113", 40, true);



    for(Student student : arr) {
      student.printStudent();
    }


  }

}
