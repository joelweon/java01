package step19;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Exam101_5 {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/Exam101_5.data");
    PrintWriter out2 = new PrintWriter(out);

    out2.print("홍길동,");
    out2.print(20);
    out2.println();
    
    out2.print("임꺽정,");
    out2.println(30);
    
    out2.println("유관순,18");
    
    out2.printf("%s, %d\n", "안중근", 30);


    out2.close();
    out.close();
  }
}