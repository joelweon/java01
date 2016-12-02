/* 주제: DBMS에 연결하기 IV
 * => 예외 처리 추가
*/
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_4 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db",
          "java89", "1111");) {
      
      System.out.println("연결성공");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

/* 오토 클로즈를 하려면 변수 선언은 안에서 해야한다.
 * finally는 없애기.
 * Connection은 java.lang.AutoClosable 인터페이스를 구현했음.
 * 서버는 클라이언트를 무한정으로 받지 않는다.
 * 하드웨어에 따라 다르다.
 * 시스템 엔지니어: 서버설치&최적화 (동시 커넥션 수 설정) 
 * 
 * 클라이언트가 접속할 때마다 Thread가 만들어진다. 동시 수 5개일 경우
 * 6번부터는 대기열에 넣고 대기열도 꽉차면 튕겨냄.
 * 서버는 클라이언트의 요청이 일정시간(time out)동안 없으면 종료시킴.
 * close를 안하면 커넥션이 부족한 상황을 방지할 수 있다. */

