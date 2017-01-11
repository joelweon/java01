/* 주제: Mybatis를 사용하여 insert하기
 * 
 * */
package step29;

import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_update {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in/*new FileInputStream("src/step29/mybatis-config.xml")*/);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
//    DB에 입력할 데이터를 준비한다.
    HashMap data = new HashMap();
    data.put("name", "임꺽정2");
    data.put("position", "부장2");
    data.put("tel", "1212-55552");
    data.put("email", "lee2@test.com");
    
    int count = sqlSession.insert("updateContacts", data);
       // 기본이 수동 커밋이다. 따라서 실제 데이터베이스에 적용하라고 명령해야 한다.
    sqlSession.commit();
    
    if (count == 1) {
      System.out.println("변경 성공!");
    } else {
      System.out.println("변경 실패!");
    }
    
//    4. SqlSession 사용 후 닫기.
    sqlSession.close();
    
  }
}
