/*Quiz4
클래스 문법을 이용하여 교육센터의 한 명의 수강생 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test4 {
  public static class Student {
    String name;
    String sex;
    String tel;
    int postno;
    String baseAddress;
    String detailAddress;
    String school;
    boolean working;
    int age;
    int money;
  }


  public static void main(String[] args) {
    Student s1 = new Student();

    s1.name = "남경훈";
    s1.sex = "남자";
    s1.postno = 31242;
    s1.age = 25;
    s1.ph = "010-5505-8506";
    s1.money = 2_8000;


    System.out.println();
    System.out.println(s1.name + "씨");
    System.out.println(s1.sex);
    System.out.println(s1.age + "세");
    System.out.println(s1.tel );
    System.out.println(s1.money + "$" );



  }
}
