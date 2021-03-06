/* 주제: @Autowired 애노테이션의 특징
 * => 타입으로 의존 객체를 찾는다.
 * => 같은 타입의 객체가 여러 개 있을 경우 예외가 발생한다.
 */
package step28.ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest31 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex10/application-context31.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}







