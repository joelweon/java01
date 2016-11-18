package step07;

public class Exam058_1 {
  public static void main(String[] args) {
    int[] arr1 = new int[]{10, 20, 30};
    int[] arr2 = new int[]{100, 200, 300, 400, 500};
    arr1 = arr2;
  }
}
//"Dangling Object" 주소를 잃어버린 인스턴스
//"Garbage Collector"
