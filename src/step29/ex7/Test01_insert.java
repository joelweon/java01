/* 주제: 부모 테이블에 데이터를 입력한 후 그 PK를 가지고 자식 테이블에 데이터를 저장하기
 * => 부모 테이블에 데이터를 입력한 후 자동으로 생성된 PK 값을 가져와야 한다.
 *    어떻게? MembMapper.xml 파일을 참조하라!
 * 자식테이블에서 부모테이블의 값을 받는 방법
 */
package step29.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01_insert {

  public static void main(String[] args) throws Exception {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step29/ex7/application-context.xml");
    
    MemberDao memberDao = iocContainer.getBean(MemberDao.class);
    TeacherDao teacherDao = iocContainer.getBean(TeacherDao.class);
  
    
    // DB에 입력할 데이터를 준비한다.
    Teacher teacher = new Teacher();
    teacher.setName("설현강사2");
    teacher.setEmail("sulhyun2@test.com");
    teacher.setTel("1111-1234");
    teacher.setPassword("1111 ");
    teacher.setHomepage("sulhyun@test.com");
    teacher.setFacebook("facebook.com/sulhyun");
    teacher.setTwitter("twitter.com/sulhyun");
    
    memberDao.insert(teacher); //얘는 자동 커밋한다.
    /*Mybatis가 만들어준 DAO 구현체는
    메서드를 호출할 때 SqlSessionFactory로부터 SqlSession을 얻어서 SQL 문을 실행한다.
    실행이 끝나면 자동으로 commit한다.
    따라서 아래에 insert() 호출이 실패하더라도 위에서 한 insert() 작업은 그대로 유지된다.*/
    System.out.println("memb 입력 성공!");
    
    teacher.setMemberNo(0);
    teacherDao.insert(teacher);
    System.out.println("tcher 입력 성공!");
  }
}

/* Transaction(트랜잭션)
 * 여러개의 데이터 변경 작업을(insert, update, delete)
 * 한 작업으로 묶은 것. 

*/



