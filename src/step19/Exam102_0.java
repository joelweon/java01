package step19;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Exam102_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam102_0.data");
    DataOutputStream out2 = new DataOutputStream(out);

    out2.writeUTF("홍길동");
    out2.writeInt(20);
    out2.writeBoolean(true);

    out2.writeUTF("임꺽정");
    out2.writeInt(20);
    out2.writeBoolean(false);

    out2.writeUTF("을지문덕");
    out2.writeInt(50);
    out2.writeBoolean(false);


    out2.close();
    out.close();
  }
}