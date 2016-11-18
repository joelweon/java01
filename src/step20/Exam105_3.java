package step20;

import java.net.Socket;
import java.util.Scanner;

public class Exam105_3 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("서버주소? ");
    String serverAddr = keyScan.nextLine();
    
    Socket socket = new Socket(serverAddr, 8888);
    System.out.println("서버와 연결되었음");
    

    keyScan.nextLine();
    keyScan.close();
    socket.close();
  }
}