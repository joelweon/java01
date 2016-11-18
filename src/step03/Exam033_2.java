// 주제: 변수 선언 - 값의 종류(data type)와 메모리 크기
package step03;

public class Exam033_2 {
  public static void main(String[] args) {

    int[] scores = new int[3];//배열 메모리 만드는 것.
    scores[0] = 100;  //배열 메모리의 번호(index)는 0번부터 시작한다.
    scores[1] = 100;
    scores[2] = 100;

    //  배열의 인덱스 범위를 벗어나면 실행오류. 컴파일은 된다.

    //int[] scores2;
    //scores2[0] = 100;

    int[] scores3 = new int[] {80, 81, 82};
    System.out.println(scores3[2]);

    int[] scores4 = {80, 81, 82};
    System.out.println(scores4[1]);


    scores5 = new int[] {80, 81, 82};

    int[] scores5;
    //scores5 = {80, 81, 82};  -> 오류

    //int[] scores6 = new[3] {100, 100, 100};  ->3을 넣고 값도 넣으면 오류

  }

}
