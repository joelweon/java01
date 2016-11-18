package step07;

public class Exam059_3 {
  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }
  public static void main(String[] args) {
    Student[] arr = new Student[3];// 레퍼런스 배열을 3개 준비한다.
                                    // Student 인스턴스가 아니다.
                                    // => Student s1, s2, s3; 와 같은 의미이다.
    //= int[] arr1 = new int[3];
    //2) 각 레퍼런스 변수에 Student 인스턴스 주소를 저장한다.

    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();



    arr[0].name = "홍길동";
    arr[0].email = "hong@test.com";
    arr[0].tel = "111-1111";
    arr[0].age = 20;
    arr[0].working = true;

    arr[1].name = "임꺽정";
    arr[1].email = "leem@test.com";
    arr[1].tel = "111-1112";
    arr[1].age = 30;
    arr[1].working = false;

    arr[2].name = "유관순";
    arr[2].email = "yoo@test.com";
    arr[2].tel = "111-1113";
    arr[2].age = 40;
    arr[2].working = true;

    for(Student student : arr) { //arr  배열 또는 컬렉션 타입이 있는 곳.
      printStudent(student);
    }


  }
}
