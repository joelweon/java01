package step20;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_1 {
  public static void main(String[] args) throws Exception {
    try (
        Socket socket = new Socket("localhost", 8888);
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        Scanner keyScan = new Scanner(System.in);) {
      
      
      System.out.println("서버와 연결되었음");
      
      while (true) {
        System.out.println("보낼 메시지? ");
        String message = keyScan.nextLine();
        
        out.println(message);
        if (message.toLowerCase().equals("quit")) {
          break;
        }
        String recvMsg = in.nextLine();
        System.out.println(recvMsg);
        if (recvMsg.toLowerCase().equals("quit")) {
          break;
        }
      }

    } catch (Exception e) {
      //e.printStackTrace();
    }
  }
}
