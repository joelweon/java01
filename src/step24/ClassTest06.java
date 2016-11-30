/* 주제: 리플랙션 API 사용법 - 클래스의 메서드 정보 추출하기 I
 * => java.lang.reflect.Method 
 * */
package step24;

import java.lang.reflect.Method;

public class ClassTest06 {
  static class MyClass {
    public static int publicStaticVar = 100;
    protected static int protectedStaticVar = 200;
    static int defaultStaticvar = 300;
    private static int privateStaticVar = 400;
    
    public int publicVar = 100;
    protected int protectedVar = 200;
    static int defalutStaticVar = 300;
    private int privateVar = 400;
    
    public static void publicStaticMethod() {}
    protected static void protectedStaticMethod() {}
    static void defalutStaticMethod() {}
    private static void privateStaticMethod() {}
    
    public void publicMethod() {}
    protected void protectedMethod() {}
    void defalutMethod() {}
    private void privateMethod() {}
    
    
  }
  public static void main(String[] args) throws ClassNotFoundException {
    Class<?> clazz = MyClass.class;
    
//    상속 받은 메서드들과 자신이 갖고 있는 메서드 중에서 public 메서드만 추출한다.
    Method[] methods = clazz.getMethods();
    
    for (Method m : methods) {
      System.out.println(m.getName());
      
    }
  }
}
