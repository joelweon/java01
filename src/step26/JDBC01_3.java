/* 주제: DBMS에 연결하기 III
*/
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_3 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
    
      
      System.out.println("연결성공");
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {con.close();} catch (Exception e) {e.printStackTrace();}
    }
  }
}
