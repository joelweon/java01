package step05;

public class Exam045_1 {
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
      {
        int c = 30;
        System.out.printf("{{%d,%d,%d}}\n", a, b, c);
      }
      //System.out.printf("{{%d,%d,%d}}\n", a, b, c);

    }
    System.out.printf("{{%d,%d,%d}}\n", a, b, c);




  }


}
