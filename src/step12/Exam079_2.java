//오토박싱(auto-boxing)과 오토언박식(auto-unboxing)
package step12;

public class Exam079_2 {
  public static void main(String[] args) throws Exception {
    int i1 = 10;
    Integer obj1 = i1; //자동으로 포장.
    System.out.println(obj1.toString());  //primitive type --> new Integer(i1): 오토박싱


    Integer obj2 = new Integer(100);
    int i2 = obj2;  //obj2에서 intvalue 값을 가져온것.
    System.out.println(i2);
  }
}
