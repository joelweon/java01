package step04;

public class Exam039_0 {
  public static void main(String[] args) {
    System.out.println();

    boolean v = 10 == 20;   //f
    System.out.println(v);

    v = 10 != 20;   //t
    System.out.println(v);

    v = 10 < 20;
    System.out.println(v);

    v = 10 <= 20;
    System.out.println(v);

    v = 10 > 20;
    System.out.println(v);

    v = 10 >= 20;
    System.out.println(v);

    System.out.println(3.14f > 3.12f);
    System.out.println(3.14 > 3.14000000000000);
    System.out.println('가' > '각');
  }
}
