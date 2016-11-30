package patterns.command.v1;

public class Calculator {
  public int plus(int a, int b) {
    return a + b;
  }
  
  public int minus(int a, int b) {
    return a - b;
  }
  
  public int multiple(int a, int b) {
    return a * b;
  }
  public int divide(int a, int b) {
    return a / b;
  }
}