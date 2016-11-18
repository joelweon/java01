//primitive type (원시타입)  byte short int long float double boolean char
package step12;

public class Exam079_0 {
  public static void main(String[] args) throws Exception {
    Integer i1 = new Integer(20);
    Integer i2 = new Integer(20);

    if (i1 != i2) System.out.println("i1 != i2");
    if (i1.equals(i2)) System.out.println("i1과 i2는 내용이 같다.");
    

  }
}
