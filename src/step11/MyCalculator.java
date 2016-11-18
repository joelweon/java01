package step11;

public class MyCalculator extends NamCalculator {
  public void remainder(int value) {
    this.result %= value;
  }

  public void power(int value) {
    int temp = this.result;
    for (int i = 0; i < value-1; i++) {
      this.result *= temp;
    }
  }
}
