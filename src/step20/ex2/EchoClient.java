package step20.ex2;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("서버주소? ");
    String serverAddr = keyScan.nextLine();
    Socket socket = new Socket(serverAddr, 8888);
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String message = null;
    do {
      System.out.print("입력>");
      message = keyScan.nextLine();
      out.println(message);
      System.out.println(in.nextLine());
    } while (!message.toLowerCase().equals("quit"));

    out.close();
    in.close();
    socket.close();
    keyScan.close();
  }
}