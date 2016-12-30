/* 주제: 객체 생성 개수를 지정하기
 */
package step28.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest23 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex5/application-context23.xml");
    
    System.out.println("---------default(singletone)--------");
    Car c1 = (Car)iocContainer.getBean("obj1");
    Car c2 = (Car)iocContainer.getBean("obj1");
    Car c3 = (Car)iocContainer.getBean("obj1");

    if (c1 == c2) System.out.println("c1 == c2");
    if (c2 == c3) System.out.println("c2 == c3");
    
    System.out.println("---------singletone--------");
    
    c1 = (Car)iocContainer.getBean("obj2");
    c2 = (Car)iocContainer.getBean("obj2");
    c3 = (Car)iocContainer.getBean("obj2");
    
    if (c1 == c2) System.out.println("c1 == c2");
    if (c2 == c3) System.out.println("c2 == c3");
    
    System.out.println("---------prototype--------");
//    obj3는 생성 정책이 prototype이기 때문에 getBean() 호출할 때 마다 새 객체를 리턴한다.
    c1 = (Car)iocContainer.getBean("obj3");
    c2 = (Car)iocContainer.getBean("obj3");
    c3 = (Car)iocContainer.getBean("obj3");
    
    if (c1 != c2) System.out.println("c1 != c2");
    if (c2 != c3) System.out.println("c2 != c3");
    if (c1 != c3) System.out.println("c1 != c3");
  }
}

/*
스프링 ioc컨테이너가 다 관리해준다.
싱글톤을 할지 스콥을 프로토로 선언할지를 개발자가 결정

싱글톤을 만들면 유연성이 떨어진다.
그러나 ioc컨테이너를 사용함으로 유연성있게 singleton or prototype 을 쉽게 변경할 수 있따.
*/