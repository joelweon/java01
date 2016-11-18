/*Quiz2
 클래스 문법을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보
 한 개를 메모리에 저장하고 그 메모리의 값을 출력하라!
*/
package step03.test;

public class Test2 {

  Ta ta = new Ta();
  Pm pm = new Pm();
  Sz sz = new Sz();
  Etc etc = new Etc();


  static class Ta{ //title_author
  static String title = "항구 마을 식당";
  static String author = "오쿠다 히데오";

}

  static class Pm { //publication_matter
    static String publisher = "RHK";
    static String date = "2016년 09월 27일";

  }

  static class Sz { //size
    static String size = "138*195*20";
    static int pagesize = 276;
  }
  static class Etc {
    static int price = 13000;
    static String isbn = "8925560062";
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.printf("책 제목: %s\n", ta.title);
    System.out.printf("저자: %s\n", ta.author);
    System.out.printf("출판사: %s\n", pm.publisher);
    System.out.printf("가격: %d원\n", etc.price);
    System.out.printf("크기: %s\n", Sz.size);
    System.out.printf("페이지 수: %d쪽\n", Sz.pagesize);
    System.out.printf("발행일: %s\n", Pm.date);
    System.out.printf("ISBN-10: %s\n", etc.isbn);
    System.out.println();

  }
}
