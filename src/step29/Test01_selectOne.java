/* 주제: Mybatis 한 개 데이터 설정##
 * 
 * */
package step29;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectOne {//마이바티스 함수 호출.
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    Map record = sqlSession.selectOne("selectOneContacts", "aaa@test.com");
     
    if (record != null) {
      System.out.printf("%s %s %s %s\n",
          record.get("name"),
          record.get("posi"),
          record.get("tel"),
          record.get("email"));
    }
    sqlSession.close();
  }
}
