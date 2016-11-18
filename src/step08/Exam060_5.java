package step08;

public class Exam060_5 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book(String title, String author) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = author;
    }
    Book(String title, String press) {
      System.out.println("Book(String,String) 호출");
      this.title = title;
      this.author = press;
    }
//=> 컴파일 오류.
  }
  public static void main(String[] args) {
    Book b1 = new Book("자바 프로그래밍", "홍길동");
    Book b2 = new Book("자바 프로그래밍", "비트출판사");
  }
}
