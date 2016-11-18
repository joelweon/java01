package step08;

public class Exam060_4 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {}

    Book(String title) {
      System.out.println("Book(String) 호출");
    }

    Book(String title, String author) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = author;
    }

    Book(String title, String press, int price) {
      System.out.println("Book(String,String,int) 호출");
      this.title = title;
      this.author = author;
      this.price = price;
    }


  }
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("자바 프로그래밍");
    Book b3 = new Book("자바 프로그래밍", "홍길동");
    Book b4 = new Book("자바 프로그래밍", "비트출판사", 30000);
    // Book b5 = new Book(30000, 890); -> 컴파일 오류 int 2개 받는 실행자 없다.
  }
}
