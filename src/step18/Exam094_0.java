package step18;

import java.io.File;

public class Exam094_0 {
  public static void main(String[] args) {
    //파일의 기본 경로는 JVM을 실행하는 폴더이다.
    //기본 경로로 작성하면 이를 "상대경로"라 부른다.
    File f = new File("test.txt");

    //다음과 같이 파일의 절대 경로를 지정할 수 있다.
    //파일의 경로를 최상위 디렉토리부터 작성하면, "절대 경로"라 부른다.
    File f2 = new File("C:/workspace/java01/test.txt");
    File f3 = new File("C:\\workspace\\java01\\test.txt");
    File f4 = new File("../intro/Hello.java");
    
  }
}



//File 클래스 사용법
//.. => 상위폴더  . => 현재 폴더