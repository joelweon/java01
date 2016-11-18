package step08;

public class Exam060_2 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book() {
      System.out.println("Book() 호출");
    }
  }
  public static void main(String[] args) {
    Book b1 = new Book();
  }


}
