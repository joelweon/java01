/* 주제: @Qualifier를 사용하여 주입할 객체 지정하기
 * => <context:annotation-config/>를 사용하여 @Qualifier 애노테이션을 처리할 객체를 등록해야 한다.
 */
package step28.ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest32 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex11/application-context32.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}







