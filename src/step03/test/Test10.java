/*Quiz
 자바 원시 타입과 String을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보
 한 개를 메모리에 저장하고 그 메모리의 값을 출력하라!
*/
package step03.test;

public class Test10 {

  public static class Book {
    String title;
    String[] author;
    String publisher;
    int price;
    String size;
    int pagesize;
    String date;
    String isbn;
  }


  public static void main(String[] args) {


    Book book = new Book();

    book.title = "항구 마을 식당";
    book.author =new String[] {"홍길동", "임꺽정"};
    book.publisher = "RHK";
    book.price = 13000;
    book.size = "138*195*20";
    book.pagesize = 276;
    book.date = "2016년 09월 27일";
    book.isbn = "8925560062";


    System.out.println();
    System.out.printf("책 제목: %s\n", book.title);
    System.out.printf("저자: %s\n", book.author[0]);
    System.out.printf("출판사: %s\n", book.publisher);
    System.out.printf("가격: %d원\n", book.price);
    System.out.printf("크기: %s\n", book.size);
    System.out.printf("페이지 수: %d쪽\n", book.pagesize);
    System.out.printf("발행일: %s\n", book.date);
    System.out.printf("ISBN-10: %s\n", book.isbn);
    System.out.println();




  }
}
