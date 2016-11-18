package hw1117;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class AgeTestClient {
  public static void main(String[] args) {
    try {
      Scanner keyScan = new Scanner(System.in);
      System.out.print("접속할 IP? ");
      String address = keyScan.nextLine();
      Socket socket = new Socket(address, 8888);
      
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream(), true, "UTF-8");
      System.out.println("테스트 서버와 연결되었습니다.");
      
      System.out.print("이름? ");
      String name = keyScan.nextLine();
      out.println(name);
      System.out.println(in.nextLine());
      
      while (true) {
        String recvMsg = in.nextLine();
        System.out.println(recvMsg);
        String answer = keyScan.nextLine().toLowerCase();
        out.println(answer);
        if (answer.toLowerCase().equals("quit")) {
          break;
        }
      }
    } catch (Exception e) {
    }
  }
  
  
  
}
