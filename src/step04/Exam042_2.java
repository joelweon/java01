package step04;

public class Exam042_2 {
  public static void main(String[] args) {
    System.out.println();

    //문제: 이력서에 프로그래밍 가능한 항목을 입력 받기
    // => 프로그래밍 보기
    //Java, JavaScript, HTML, CSS, C, C++, PHP, Python, Perl, VB,
    //R, Groovy, XML, Scals, Ruby, Swift, Object-C, pascal, C#, Go

/*
    int[] language = new int[] {
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
      0, 1, 1, 0, 0, 0, 1, 1, 0, 0
    };

    int v5 = language[0] + language[4] + language[5];
    String result = (v5 == 3) ? "Yes" : "No";
    System.out.println(result);
*/

    byte[] language = new byte[] {
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
      0, 1, 1, 0, 0, 0, 1, 1, 0, 0
    };

    int v5 = language[0] + language[4] + language[5];
    String result = (v5 == 3) ? "Yes" : "No";
    System.out.println(result);




    System.out.println();

  }
}
