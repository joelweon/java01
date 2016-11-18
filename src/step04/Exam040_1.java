package step04;

public class Exam040_1 {
  public static void main(String[] args) {
    System.out.println();

    System.out.println(true & true);
    System.out.println(true & false);
    System.out.println(false & true);
    System.out.println(false & false);

    System.out.println(true | true);
    System.out.println(true | false);
    System.out.println(false | true);
    System.out.println(false | false);


    System.out.println("---------------------------------");

    boolean a = false;
    boolean b = true;
    boolean c = a && (b = false); //&&는 앞이 false이기 때문에 이미 결론(false)나서 뒤는 실행X
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);


    System.out.println("---------------------------------");

    a = false;
    b = true;
    c = a & (b = false);  //&는 앞의 값과 상관없이 모든 명령 실행.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);


    System.out.println("---------------------------------");

    a = true;
    b = true;
    c = a || (b = false);  //&는 앞의 값과 상관없이 모든 명령 실행.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);

    System.out.println("---------------------------------");

    a = true;
    b = true;
    c = a | (b = false);  //&는 앞의 값과 상관없이 모든 명령 실행.
    System.out.printf("a=%b, b=%b, c=%b\n", a, b, c);


//식이 뒤에 있다면 앞에 연산자에 따라 동작 방식이 다름!!!



    System.out.println();

  }
}
