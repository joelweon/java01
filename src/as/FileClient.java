package as;

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
    System.out.printf("파일명: %s\n", file.getName());
    System.out.printf("파일크기: %d\n",  file.length());
    
    

    
    
    Socket socket = new Socket("localhost", 8888);
    Scanner socketIn = new Scanner(socket.getInputStream());
    DataOutputStream socketOut = new DataOutputStream(socket.getOutputStream());
    
    socketOut.writeUTF(file.getName());
    socketOut.writeLong(file.length());
    System.out.println(socketIn.nextLine());
    
    System.out.println("파일명 및 파일 크기를 전송하였습니다.");
    
    socketIn.close();
    socketOut.close();
    socket.close();
    
  }
}