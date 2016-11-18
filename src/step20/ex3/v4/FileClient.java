package step20.ex3.v4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("파일? ");
    String fileName = keyScan.nextLine();

    
    File file = new File(fileName);
    System.out.printf("파일명: %s\n",file.getName());
    System.out.printf("파일크기: %d\n",file.length());

    
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
    DataInputStream in0 = new DataInputStream(in);
    
    while (true) {
      int b = in0.read();
      if (b == -1)
        break;
    }
    System.out.println("파일을 모두 읽었습니다.");
    in0.close();
    in.close();
    keyScan.close();
    
    Socket socket = new Socket("localhost", 8888);
    Scanner socketIn = new Scanner(socket.getInputStream());
    DataOutputStream socketOut = new DataOutputStream(socket.getOutputStream());
    
    socketOut.writeUTF(file.getName());
    socketOut.writeLong(file.length());
    System.out.println(socketIn.nextLine());
    
    System.out.println("파일명 및 파일크기를 전송하였습니다.");
    
    socketOut.close();
    socketIn.close();
    socket.close();
  }

}
