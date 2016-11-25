package patterns.command.v2;

public class MinusOp implements Operator {
  public int execute(int a, int b) {
    return a - b;
  }
}
