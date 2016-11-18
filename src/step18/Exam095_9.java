package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_9 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_9.data");

    out.write(136);
    out.write(153); //136
    out.write(170); 
    out.write(187);
    out.write(204);
    
    
    



    out.close();
  }
}
/*
0111 1111 (127)
...
0000 0010 (2)
0000 0001 (1)
0000 0000 (0)
1111 1111 (-1)
...
1000 00000 (-)
*/