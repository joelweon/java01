package step10;

public class Exam063_1 {
  static class MyType {
    static int a;
    int b;
  }
  public static void main(String[] args) {
    MyType.a = 200;
    System.out.println(MyType.a);

    MyType obj1 = new MyType();
    MyType obj2 = new MyType();

    obj1.b = 200;
    obj2.b = 300;
    System.out.printf("MyType.a = %d, obj1.b = %d, obj2.b = %d\n",
                         MyType.a, obj1.b, obj2.b);

    obj1.a = 500;
    System.out.printf("MyType.a = %d, obj1.b = %d, obj2.b = %d\n",
                         MyType.a, obj1.b, obj2.b);
    obj1.a = 600;
    System.out.printf("MyType.a = %d, obj1.b = %d, obj2.b = %d\n",
                        MyType.a, obj1.b, obj2.b);

  }

}
//인스턴스 레퍼런스로 스태틱 변수를 사용할 수 있다.->obj주소로 갔는데 인스턴스 변수가 없다면
//스태틱 변수로 간주한다.
//그러나 딱 봤을 떄 인스턴스 변수처럼 생겼기 떄문에 혼란을 방지하고자 스태틱 변수는
//클래스명.변수명 으로 해준다.
//가독성을 위해.
