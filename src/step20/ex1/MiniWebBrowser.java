package step20.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MiniWebBrowser {
  public static void main(String[] args) throws Exception {
//  Data Sink Stream 준비 => 랜카드를 통해 데이터를 입출력
//    1) 랜카드 접속 객체 준비
    Socket socket = new Socket("www.daum.net", 80);
    
//    2) 입출력 객체 준비
    InputStream in = socket.getInputStream(); //바이트 배열읽고쓰기
    OutputStream out = socket.getOutputStream();
    
//    3) 문자열 입출력을 쉽게할 수 있도록 데코레이터(Data Processing Stream)를 준비한다.
    Scanner in2 = new Scanner(in);
    PrintStream out2 = new PrintStream(out); //라인단위 출력 
//    4) 서버에게 HTTP 규칙에 따라 요청 정보를 보낸다.
//    HTTP 요청 규칙?
//    요청방식 요청할자원의주소 프로토콜/버전 CRLF
//    Host: 요청을 받을 서버 이름
//    빈 줄
    out2.println("GET / HTTP/1.1");
    out2.println("Host: www.daum.net");
    out2.println();
    
//    5) 서버에서 응답한 내용을 읽기
    String line = null;
    while (true) {
      try {
        line = in2.nextLine();
        System.out.println(line);
      } catch (Exception e) {
        break;
      }
    }
//    6) 다 쓴 자원은 닫는다.
    out2.close();
    in2.close();
    out.close();
    in.close();
    socket.close();
  }
}