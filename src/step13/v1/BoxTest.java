//값을 저장할 떄 사용할 메모리를 정의한다.

package step13.v1;

public class BoxTest {
  public static void main(String[] args) {
    Box b1 = new Box(100);
    Box b2 = new Box(200);
    Box b3 = new Box(300);

    b1.next = b2;
    b2.next = b3;

    Box cursor = b1;
    while (cursor != null) {
      System.out.println(cursor); //cursor.toString() 할 필요없다.
      cursor = cursor.next;
    }


  }
}
