package step19;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Exam102_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam102_0.data");
    DataInputStream in2 = new DataInputStream(in);

    System.out.printf("%s, %d, %b\n",
      in2.readUTF(), in2.readInt(), in2.readBoolean());

    System.out.printf("%s, %d, %b\n",
      in2.readUTF(), in2.readInt(), in2.readBoolean());

    System.out.printf("%s, %d, %b\n",
      in2.readUTF(), in2.readInt(), in2.readBoolean());

    in2.close();
    in.close();
  }
}