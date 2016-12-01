/* 주제: DBMS에 연결하기
 * => 조건
 * 1) DBMS가 설치되어 있어야 한다.
 * 2) DBMS 서버가 실행되어 있어야한다.
 * 3) JDBC 드라이버를 다운로드 하였다. (Download-connectors-J-ZIP)
 *   - java01/libs/mysqul-connector-java-5.1.40-bin/jar
 * 4) 프로젝트 빌드 경로에 JDBC 드라이버를 추가한다.
 *   => 프로젝트 속성창(java01)-> Java Build Path -> Libraries -> Add JARs -> libs/mysql 선택
 *   => 프로젝트 경로에 JDBC 드라이버 파일("*.jar")을 추가하면 
 *      그 JAR 파일에 들어있는 클래스를 사용할 수 있다. 
 * 5)  
*/
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_2 {
  public static void main(String[] args) throws Exception {
//    1) java.sql.Driver를 구현한 클래스 객체 로딩
    Class.forName("com.mysql.jdbc.Driver");
    
//    2) DriverManager는 위에서 로딩한 java.sql.Driver 구형체를 자동을 찾는다.
//      => 그리고 그 구현체의 인스턴스를 자동으로 생성한다.
//      => 생성한 인스턴스를 통해 java.sql.Connectuib  구현체를 얻는다.
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
    
//    정상적으로 DBMS에 연결되었다면 예외가 발생하지 않고 리턴할 것이다.
    System.out.println("연결성공");
    
//    3) 프로그램을 종료하기 전에 연결을 끊는다.
//     => 만약 연결을 끊지 않으면 DBMS는 일정시간 동안 연결을 유지하다가
//        내부에 설정된 시간이 경과하면(timeout) 자동으로 연결을 끊는다.
//     => 가능한 사용후 바로 연결을 끊으면, 다른 클라이언트가 DBMS와 연결할 수 있을 것이다.
//          다른 클라이언트가 쉽게 DBMS와 연결할 수 있을 것이다.
    con.close();
  }
}
