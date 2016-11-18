package step07;

public class Exam059_0 {

  public static void main(String[] args) {
    Student s1;
    Student s2;
    String str; // --> 로컬변수.
    int age; // --> 로컬변수. 데이터 타입에 따른 차이가 아니라 new의 사용여부에 따라.
    s1 = new Student();
    s2 = new Student();

    s1.name = new String("홍길동"); //new로 만들어진 것은 Heap에 저장됨.
    s1.email = new String("hong@test.com");
    s1.tel = new String("111-1111");
    s1.age = 30;
    s1.working = true;

    s1.name = "홍길동"; //값이 저장되는 것이 아니라 인스턴스 주소를 저장한다.
    s1.email = "hong@test.com"; //스트링 레퍼런스를 저장 ->
    s1.tel = "111-1111";
    s2.age = 20;
    s2.working = false;

    System.out.println(s1.name);
    System.out.println(s2.age);
  }
}


//원래는 힙 안에 스트링 name 레퍼런스는 주소값이 저장되나
//이해편의상 홍길동이 들어간다고 함.
