package as;

import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class RequestThread extends Thread {
  private Socket socket;
  private Scanner in;
  private PrintStream out;
  
  private HashMap<String,Command> commandMap;
  
  public RequestThread(Socket socket, HashMap<String,Command> commandMap) {
    this.socket = socket;
    this.commandMap = commandMap;
  }
  
  @Override
  public void run() {
    try {
      in = new Scanner(
          )
    }
  }
}