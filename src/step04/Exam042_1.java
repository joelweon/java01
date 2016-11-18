package step04;

public class Exam042_1 {
  public static void main(String[] args) {
    System.out.println();

    //문제: 이력서에 프로그래밍 가능한 항목을 입력 받기
    // => 프로그래밍 보기
    //Java, JavaScript, HTML, CSS, C, C++, PHP, Python, Perl, VB,
    //R, Groovy, XML, Scals, Ruby, Swift, Object-C, pascal, C#, Go

    boolean[] language = new boolean[] {
      false, true, true, true, true, true, true, true, true, true,
      false, true, true, false, false, false, true, true, false, false
    };



    String result = (language[0] && language[4] && language[5] ) ? "Yes" : "No";
    System.out.println(result);

    int v1 = ((language[0]) ? 1 : 0);
    int v2 = ((language[0]) ? 1 : 0);
    int v3 = ((language[0]) ? 1 : 0);
    result = (v1 + v2 + v3 == 3) ? "Yes" : "No";
    System.out.println(result);

    int v5 = ((language[0]) ? 1 : 0);
    v5 = v5 + ((language[4]) ? 1 : 0);
    v5 = v5 + ((language[5]) ? 1 : 0);
    result = (v5 == 3) ? "Yes" : "No";
    System.out.println(result);

    System.out.println();

  }
}
