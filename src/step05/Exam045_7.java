package step05;

public class Exam045_7 {

  public static void main(String[] args) {
    int a = 100;
    m1(a);
    System.out.printf("main-->%d\n", a);

    m1(a);
    System.out.printf("main-->%d\n", a);

    m1(a);
    System.out.printf("main-->%d\n", a);
  }


  static void m1(int a) {
    System.out.printf("m1-->%d\n",a);
    a = 300;
  }

}
