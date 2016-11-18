package step05;

public class Exam048_5 {
  public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    ohora:
    while (count++ < 5) {
      while (count2++ < 3) {
        System.out.println("*****");
        if (count > 2)
          break ohora;
      }
      count2 = 0;
      System.out.println("---------------------");
    }
    System.out.println("+++++++++++++++++++++++++");

    ohora: {
      while (count++ < 5) {
        while (count2++ < 3) {
          System.out.println("*****");
          if (count > 2)
            break ohora;
        }
        count2 = 0;
        System.out.println("---------------------");
      }
    }


  }
}
