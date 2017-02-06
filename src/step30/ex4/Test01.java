/* 주제: 필터에서 메서드의 ###
 * 1) AOP 라이브러리 등록
 *   - build gradle: aspectj-weaver 의존 라이브러리 추가
 * 2) AOP 필터 객체 등록
 *   - 메서드 호출 전 후에 실행될 객체 등록
 * */
package step30.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex4/application-context.xml");
    
    Control c = iocContainer.getBean(Control.class);
    c.testPlus();
  }
}
