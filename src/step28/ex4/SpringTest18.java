/* 주제: Set 의존 객체 주입하기 
 */
package step28.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest18 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex4/application-context18.xml");
    
    System.out.println("----------------------");
    System.out.println(iocContainer.getBean("c1")); //<--set인 경우
    System.out.println(iocContainer.getBean("c2"));
  }
}

/*
set은 집합이기 때문에 중복허용하지 않는다.

*/


