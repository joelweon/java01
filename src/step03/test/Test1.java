/*Quiz
 자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보
 한 개를 메모리에 저장하고 그 메모리의 값을 출력하라!
*/
package step03.test;

public class Test1 {
  public static void main(String[] args) {
    String title = "항구 마을 식당";
    String author = "오쿠다 히데오";
    String publisher = "RHK";
    int price = 13000;
    String size = "138*195*20";
    int pagesize = 276;
    String date = "2016년 09월 27일";
    String isbn = "8925560062";

    System.out.println();
    System.out.printf("책 제목: %s\n", title);
    System.out.printf("저자: %s\n", author);
    System.out.printf("출판사: %s\n", publisher);
    System.out.printf("가격: %d원\n", price);
    System.out.printf("크기: %s\n", size);
    System.out.printf("페이지 수: %d쪽\n", pagesize);
    System.out.printf("발행일: %s\n", date);
    System.out.printf("ISBN-10: %s\n", isbn);
    System.out.println();




  }
}
