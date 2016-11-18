package step08;

public class Exam060_3 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    //생성자가 단 하나라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.
    Book(String title) {
      System.out.println("Book() 호출");
    }
  }
  public static void main(String[] args) {
    //Book b1 = new Book();
     Book b2 = new Book("하하하");

     Book b3 = new Book; //컴파일 오류 생성자 호출없이 인스턴스 만들 수 없다.
  }


}
