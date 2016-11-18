package step15;

public class Exam085_2 {
  static class A {
    int v1;

    public A() {
      //super();
      System.out.println("A()....");
      v1 = 100;
    }

    public A(int a) {
      //super();
      System.out.println("A(int)...");
      v1 = a;
    }    
  }

  static class B extends A {
    int v2;
    
    public B() {
      //super();
      System.out.println("B()...");
      v2 = 200;
    }
  
    public B(int a) {
      //this() 나 super()는 생성자 블록에서 첫 문장이 되야 한다.
      super(200);
      this();
      System.out.println("B(int)...");
      v2 = a; 
    }
  }


  public static void main(String[] args) {
    B obj = new B(100);
    System.out.println("-------------------------");
  }

}