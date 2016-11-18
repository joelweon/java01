package step19;

import java.io.FileReader;
import java.io.IOException;

public class Exam100_3 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/Exam100_2.data");

    while (true) {
      int ch = in.read();
      if (ch == -1)
        break;
      System.out.printf("%x ", ch);
    }

    System.out.println();
    
    in.close();
  }
}
// 캐릭터 스트림을 사용하면 따로 encodig과정을 거치지 않아도 된다.
// 자동 변환이 됨.
// 바이너리 데이터를 다룰 때는 InputStream/ OutputStream 클래스를 사용해라
// 바이너리 데이터는 중간에 자동 변환이 없고, 순수하게 데이터를 읽고 쓴다.
// reader로 이미지 파일을 문자로 쓰면 윈도우의 경우 ms949로 변환시켜
// 이상한 값이 나온다.