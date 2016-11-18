package step06;

public class Exam052_2 {

  static void printCenterStarsLine(int lineSize, int starLength) {
    int blankLength = (lineSize - starLength) / 2;
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    if (starLength % 2 == 0) {
      starLength++;
    }

    int count;
    if (lineSize != starLength) {
      for (count = 0; count < blankLength; count++) {
        System.out.print(" ");
      }
    }
    for (count = 0; count < starLength; count++) {
      System.out.print("*");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int l = Integer.parseInt(args[0]);
    int s = Integer.parseInt(args[1]);
    printCenterStarsLine(l, s);
  }
}
