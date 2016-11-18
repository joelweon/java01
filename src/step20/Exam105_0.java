package step20;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam105_0 {
  public static void main(String[] args) throws Exception {
    // 서버 만들기
//    1) 클라이언트와의 연결을 수행하는 객체 준비
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    try (
    //    2) 대기열에서 기다리고있는 클라이언트 중 한 개의 접속을 승인한다.
        Socket socket = ss.accept();
        
    //    3) 데이터를 주고 받기 윈한 입출력 스트림 객체 준비
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        Scanner keyScan = new Scanner(System.in);) { //java.lang.Autocloseable 만 try에 있을 수 있다.
      
      System.out.println("클라이언트와 연결되었음");

      while (true) {
//      4) 클라이언트가 보낸 데이터를 읽는다.
        String recvMsg = in.nextLine();
        System.out.println(recvMsg);
        if (recvMsg.toLowerCase().equals("quit")) {
          break;
        }
        
  //      5) 클라이언트로 데이터를 보내기 전에 사용자의 입력을 기다린다.
        
        System.out.println("대답? ");
        String message = keyScan.nextLine();
        
  //     6) 사용자가 입력한 메시지를 클라이언트로 보낸다.
        out.println(message);
        if (message.toLowerCase().equals("quit")) {
          break;
        }
      }
      
    } catch (Exception e) {
//      e.printStackTrace();
    }
//    7) 서버 소켓을 닫는다. => 더 이상 클라이언트와 연결할 수 없다.
    ss.close();
  }
}



/*주제: 네트워킹 프로그래밍 - 서버 소켓
 * 서버: 클라이언트의 요청을 받아서 작업을 처리하고 응답하는역할
 * 클라이언트: 서버에 작업을 의뢰하는 역할.
 * 
 * 포트번호: 연결을 구분하기 위한 번호로써 서버, 클라이언트 모두 필요하다.
 *           서버는 스스로 포트번호을 지정한다.
 *           클라이언트는 운영체제로부터 자동으로 배정받는다.
 *           포트번호는 중복되어서는 안된다.
 *           서버의 포트번호는 지정되어있어야한다.
 * well-known port : 0 ~ 1023 까지의 포트번호를 말한다.
 *                   기존에 유명 서비스가 주로 사용하는 번호로 일반 프로그램에서 사용하지 말도록 권고하고 있다.
 *                   20 : FTP 데이터 전송 포트
 *                   21 : FTP 제어 포트
 *                   22 : SSH(Secure shell) 서버
 *                   23 : 텔넷 서버
 *                   25 : SMTP(simple main trans) 메일 발송 서버
 *                   53 : DNS 서버
 *                   80 : 웹 서버가 사용
 *                   109 : POP2 서버 메일 받는 서버
 *                   110 : POP3 서버 메일 받는 서버
 *                   119 : 
 *                   143 : IMAP4 서버. 메일 받는 서버
 *                   443 : SSL방식의 HTTP = HTTPS
 *                   8080 : 프록시 서버
 *                   1521 : 오라클 DBMS 서버
 *                   3306 : MySQL DBMS
 *           
 *
 * IP 주소: 각 컴퓨터에 부여된 인터넷 주소이다.
 *          IP4에서는 0~255.0~255.0~255.0~255 이렇게 표시한다.
 *          4바이트 값을 이용하여 IP주소를 표현한다.
 *          Ipv4
 * 도메인명: Ip 
 *           IP 주소는 숫자로 이루어져서 기억하기가 쉽지않다.
 *           기억을 쉽게 하도록 알파벳과 숫자로 이루어진 이름을 사용한다.
 *           "컴퓨터명.도메인명.그룹명" 형식으로 이름을 부여하낟.
 *           예) www.naver.com
 *           www -> host name
 *           naver.com -> domain name
 *           "컴퓨터명.파트명.도메인명.그룹명"   4개의 이름으로 구성할 수 있다.
 *           도메인의 그룹명은 두개 이상의 이름으로 구성될 수 있다.
 *           예) 
 *           com - 회사
 *           org - 비영리 조직
 *           net - 비영리 조직
 *           co.kr - 한국 일반 회사 도메인
 *           go.kr -  한국 정부에서 관리하는 그룹. 일반인이 소속될 수 없다.
 * 도메인 등록: 도메인을 관리하는 국제 공인기관(ICANN)에서 위탁받아 운영하는 회사를 통해 등록할 수 있다.
 * 
 *  DBS
 *     
 *    =>           
 *           
 */