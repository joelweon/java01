package step20;

import java.net.ServerSocket;
import java.util.Scanner;

public class Exam105_2 {
  public static void main(String[] args) throws Exception {
//  
    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버 실행 중...");
    
    Scanner keyScan = new Scanner(System.in);
    keyScan.nextLine();  //  사용자가 한 줄 입력할 때 까지 리턴하지 않는다. => blocking
    
    
    keyScan.close();
    ss.close();
  }
}

//accept가 아니라 