/* 주제: 애노테이션 - 프로퍼티 이름 생략
 * => 프로퍼티 이름이 'value'이고,
 *    value 값 한 개를 지정할 때는 이름을 생략할 수 있다.
 *     */
package step25;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test08 {
  
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface MyAnnotation {
    String value() default "1";
    String value2() default "22";
    String value3() default "333";
  }
  
//  @MyAnnotation(value="홍길동") // OK!
//  @MyAnnotation(value2="홍길동") // OK!
//  @MyAnnotation(value3="홍길동") // OK!
//  @MyAnnotation("홍길동") // OK! 왜? 프로퍼티 이름이 value 이니까, value가 아닌 것은 생략 불가
  @MyAnnotation("홍길동") // 컴파일 오류! 값을 2개 지정할 떄는 value 생략 불가!
  public static class MyClass {}


  
  public static void main(String[] args) throws Exception {
    MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
    System.out.println(anno.value());
    System.out.println(anno.value2());
    System.out.println(anno.value3());
  }
}
