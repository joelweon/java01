/* 주제: 부모 테이블에 데이터를 입력한 후 그 PK를 가지고 자식 테이블에 데이터를 저장하기
 * => 부모 테이블에 데이터를 입력한 후 자동으로 생성된 PK 값을 가져와야 한다.
 *    어떻게? MembMapper.xml 파일을 참조하라!
 * 자식테이블에서 부모테이블의 값을 받는 방법
 */
package step29.ex4;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test03_insert {

  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex4/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in); 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // DB에 입력할 데이터를 준비한다.
    Teacher teacher = new Teacher();
    teacher.setName("보호라강사2");
    teacher.setEmail("bohora2@test.com");
    teacher.setTel("1111-2232");
    teacher.setPassword("1111");
    teacher.setHomepage("bohora@test.com");
    teacher.setFacebook("facebook.com/bohora");
    teacher.setTwitter("twitter.com/bohora");
    
    try {
      sqlSession.insert("member.insert", teacher);
      System.out.println("memb 입력성공!");
      
      teacher.setMemberNo(0);
      sqlSession.insert("teacher.insert", teacher);
      System.out.println("memb 입력성공!");
      sqlSession.commit(); 
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("입력 실패!");
    }
        
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }

}







