/*Quiz
  클래스 문법을 이용하여 쇼핑몰의 한 개 제품 정보를 저장하고 출력하라!
*/
package step03.test;

public class Test3 {

  static class Food {
    String name;
    String maker;
    String description;
    int price;
    int weight;
    int quantity;
    boolean used;
  }//설계도

  public static void main(String[] args) {

    Food food1 = new Food(); //설계도에 따라 메모리를 만들어라.

    food1.name = "참살이 혼합 16곡";
    food1.maker = "푸른곳간";
    food1.description = "혼합곡";
    food1.price = 3900;
    food1.weight = 2;
    food1.quantity = 7796;
    food1.used = false;
    food1.weight = 2;


    System.out.println();
    System.out.printf("이름: %s\n", food1.name);
    System.out.printf("회사: %s\n", food1.maker);
    System.out.printf("ㅅ: %s\n", food1.description);
    System.out.printf("가격: %d 원\n", food1.price);
    System.out.printf("무게: %d kg\n", food1.weight);
    System.out.println(food1.quantity);
    System.out.println("수량: " + food1.quantity);
    System.out.println();




  }
}
