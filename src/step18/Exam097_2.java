package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam097_2 {
  //버퍼에있는 것을 다 쓰기 전까지는 데이터를 읽지않음
  //파일 엑세스 빈도가 줄어듬. (찾는 횟수, 시간을 줄여줌-seekTime 감소)
  static class BufferedInputStream extends FileInputStream {
    byte[] buf = new byte[8192];
    int length; //읽어오기 위한 바이트 개수
    int cursor;

    public BufferedInputStream(String path) throws FileNotFoundException {
      super(path);
    }

    @Override
    public int read() throws IOException{
      if (cursor == length) {
        length = super.read(buf); //원래의 read()를 사용하여 버퍼를 채운다.
        cursor = 0;
        if (length == -1) // 만약 파일에서 다 읽었으면 , 즉시 -1리턴 
          return -1;
      }

      //파일에서 버퍼로 데이터를 퍼 왔으면, 버퍼에서 데이터를 하나 꺼내 리턴.
      return buf[cursor++] & 0x000000FF; //맨 끝 1 바이트 값만 유효하고 나머지 0.
    }
  }


  public static void main(String[] args) throws Exception {
    BufferedInputStream in = new BufferedInputStream("temp/jls8.pdf");

    long startMillis = System.currentTimeMillis();

    int count = 0;

    while (in.read() != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}