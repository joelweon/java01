package step22.ex5;

public class Tank extends Car {
  int numOfCannon;
  
  public void speedUp() {
    if (speed < 200) {
      speed += 5;
    }
  }
  
  public void speedDown() {
    if (speed > 5) {
      speed -= 5;
    }
  }
  
  public void run() {
    System.out.println("달린다");
    energy -= 10;
  }
  
  public void attack() {
    System.out.println("포탄 발사");
    numOfCannon--;
  }
  
  public void fillCannon() {
    numOfCannon = 100;
    System.out.println("포를 다 채웠습니다.");
  }
}
