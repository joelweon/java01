package hw1117;

public class AgeTest {
  private String question;
  private int yes;
  private int no;
  
  public AgeTest() {}
  
  public AgeTest(String question, int yes, int no) {
    this.question = question;
    this.yes = yes;
    this.no = no;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public int getYes() {
    return yes;
  }

  public void setYes(int yes) {
    this.yes = yes;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }
  
  public String a() {
    return "마치 어린아이처럼 천진난만하고 순진무구한 유형.                             [enter]\n" +
           "그러나 순진무구한 부분이 잔혹함으로 변하기도 한다.                          [enter]\n" +
           "자기세계에서 자기 중심적으로 살아가며 자신의 욕구를                         [enter]\n" +
           "충족시키는 일을 가장 중요하게 생각한다.                                     [enter]\n" +
           "물론 모든 일이 자기를 위해 움직이며 자기 뜻대로 될 것이라고 믿으며 살아간다.[enter]\n" +
           "==========================테스트 종료===================================";
  }
  
  public String b() {
    return "선악의 구분을 할 수 있으므로 해서는 안되는 일과 해도 되는 일을 구분 할 수 있다.        [enter] \n" +
           "물론 때와 장소를 가려서 자신을 제어하는 능력도 갖추고 있다. 그러나                     [enter] \n" +
           "불안감과 공포심으로 가득하기 때문에 주변 사람들에게 쉽게 의지하고 유혹에 쉽게 현혹된다.[enter] \n" +
           "==========================테스트 종료===================================";
  }
  
  public String c() {
    return "질풍노도의 시기라고 일컬어 지는 사춘기 수준.                                            [enter]\n" +
           "고민이 많은 시기이기도 하다. 활동적이고 지적호기심이 왕성한 반면에 모든것을 알고 있다며 [enter]\n" +
           "어른 행세를 하려든다. 때때로 오만하고 건방지다는 인상을 주기도 한다.                    [enter]\n" +
           "==========================테스트 종료===================================";
  }
  
  public String d() {
    return "정신적으로 자립한 상태로 책임을 가지고 자신의 일을 해내는 사회인 수준      [enter]\n" + 
           "그러나 사물을 판단하는데 너무나 현실적이고 융통성이 없다.                  [enter]\n" +
           "물론 선입견과 고정관념에 사로잡혀 진실을 제대로 파악하지 못할 수도 있다.   [enter]\n" +
           "또한 물질과 돈을 최우선으로 생각하는 경향이 있다.                          [enter]\n" +
           "==========================테스트 종료===================================";
  }
  
  public String e() {
    return "인생을 달관하고 정신적인 안정을 추구하며 온화하고 평온한 상태.       [enter]\n" +
           "돈, 물직적인 것에 집착하지 않고 인생을 즐기고자 하는 사람이지만      [enter]\n" +
           "새로운 일에 도전하는 것을 귀찮아 하며 세상일에 무관심한 경향이 있다. [enter]\n" +
           "==========================테스트 종료===================================";
  }
}