/*Quiz
프로그램 아규먼트로 두 개의 수를 입력받아 둘 중 큰 수를 출력하시오!
조건 연산자를 사용하여 구현하라(조건문X)
*/

package step04.test;

public class Test02{
  public static void main(String[] args) {
    System.out.println();


    int value1 = Integer.parseInt(args[0]);
    int value2 = Integer.parseInt(args[1]);

    int result = (value1 > value2) ? value1 : value2;
    //string result = (value1 > value2) ? args[0] : args[1];
    System.out.println(result);




    System.out.println();
  }
}
