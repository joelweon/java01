package hw1117;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class AgeTestServer {
  static ArrayList<AgeTest> list = null;
  static int listIndex;
  static int countQuestion = 19;
  
  static {
    list = new ArrayList<>();
    listIndex = -1;
  }
  
  public static void main(String[] args) throws Exception {
    readyTest();
    
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("=== 정신연령테스트 ===");
    System.out.println("대기중...");
    
    try (
      Socket socket = ss.accept();
      
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream(), true, "UTF-8");
      
      Scanner keyScan = new Scanner(System.in);
     ) {
      System.out.println("사용자가 접속하였습니다.");
      

      AgeTest test = null;
      String answer = null;
      boolean sayHi = false;
     
      while (true) {
        if (!sayHi) {
          answer = in.nextLine();
          out.println(answer + "님 환영합니다.");
          sayHi = true;
        }
        

        if (listIndex > countQuestion) {
          String last = in.nextLine();

          if (last.toLowerCase().equals("quit")) {
            break;
          } else if (last.toLowerCase().equals("a")) {
            out.println(test.a());
            break;
          } else if (last.toLowerCase().equals("b")) {
            out.println(test.b());
            break;
          } else if (last.toLowerCase().equals("c")) {
            out.println(test.c());
            break;
          } else if (last.toLowerCase().equals("d")) {
            out.println(test.d());
            break;
          } else if (last.toLowerCase().equals("e")) {
            out.println(test.e());
            break;
          }

          listIndex = -1;
        } else if (listIndex != -1){
          answer = in.nextLine();
        }
 
        test = printQuestion(listIndex, answer);
        out.println(test.getQuestion());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    ss.close();
  }
  
  static AgeTest printQuestion(int index, String answer) {
    if (index == -1) {
      listIndex = 0;
      return list.get(0);
    } else if (answer.toLowerCase().equals("y")){
      listIndex = list.get(index).getYes() - 1;
      return list.get(listIndex);
    } else if (answer.toLowerCase().equals("n")){
      listIndex = list.get(index).getNo() - 1;
      return list.get(listIndex);
    }
    return new AgeTest("잘못된 답변입니다.(y/n)", -2, -2);
  }
  
  static void readyTest() {
    list.add(new AgeTest("하루종일 아무것도 하지 않으면 지루해서 미칠 것 같다.(y/n)", 4, 2));
    list.add(new AgeTest("다른 사람과의 경쟁이나 승부에서 지면 너무나 분해서 참을수가 없다.(y/n)", 3, 5));
    list.add(new AgeTest("가까이에서 어린아이가 울고불고 떼를 쓰는 광경을 보면 화가 난다.(y/n)", 6, 5));
    list.add(new AgeTest("편식이 심하고 반찬에 싫어하는 것이 섞여 있으면 반드시 빼고 먹는다.(y/n)", 6, 3));
    list.add(new AgeTest("내 험담을 하고 다니거나 내게 상처를 준 사람은 절대로 용서해줄 수가 없다.(y/n)", 9, 12));
    list.add(new AgeTest("화가 나거나 마음대로 안될때면 애꿎은 곳에 화풀이를 하는 경향이 있다.(y/n)", 8, 9));
    list.add(new AgeTest("집에 있으면 대체로 하루종일 TV를 켜놓고 사는 편이다.(y/n)", 14, 13));
    list.add(new AgeTest("갖고 싶은 것이 있으면 바로 손에 넣으려고 한다. 절대 참을 수 없다.(y/n)", 15, 7));
    list.add(new AgeTest("심령사진이나 초자연적인 현상에 관심이 많고 무서운 만화와 공포영화를 즐겨 보는 편이다.(y/n)", 7, 10));
    list.add(new AgeTest("우리 부모나 부모 세대의 애정행위는 상상할 수 조차 없다.(y/n)", 13, 17));
    list.add(new AgeTest("다른 사람이 뭐라 하든 상관하지 않으며 화도 잘 내지 않는 편이다.(y/n)", 20, 17));
    list.add(new AgeTest("내가 다른 사람에게 해준것 보다 받은게 더 많다고 생각한다.(y/n)", 11, 10));
    list.add(new AgeTest("이제 만화책과 만화영화는 재미없고 유치하다.(y/n)", 16, 18));
    list.add(new AgeTest("30분이상 책상 앞에 앉아 있을 수 없고 주위가 산만하다.(y/n)", 19, 18));
    list.add(new AgeTest("촌스러운 사람과 특이한 사람을 보면 괴롭히고 싶은 충동을 느낀다.(y/n)", 19, 14));
    list.add(new AgeTest("훌륭한 선생님과 성공한 사람을 보면 반항심이 생기는 경우가 있다.(y/n)", 23, 24));
    list.add(new AgeTest("나는 아직 모르는 것이 많다고 생각한다.(y/n)", 20, 16));
    list.add(new AgeTest("어른들의 세계란 참으로 더러운 곳이며 믿을 놈 없다고 생각한다.(y/n)", 23, 22));
    list.add(new AgeTest("누가 내 흉을 보면 반박한다. 그렇지 않으면 자신이 바보같이 느껴진다.(y/n)", 21, 22));
    list.add(new AgeTest("이렇게 살아가고 있다는 것에 감사하고 있을 따름이다.(y/n)", 25, 24));
    list.add(new AgeTest("당신의 정신연령은 <유아수준> 입니다. [quit]: 나가기, [enter]: 이어하기, [A]: 상세정보", -1, -1));
    list.add(new AgeTest("당신의 정신연령은 <초등학생수준> 입니다. [quit]: 나가기, [enter]: 이어하기, [B]: 상세정보", -1, -1));
    list.add(new AgeTest("당신의 정신연령은 <사춘기수준> 입니다. [quit]: 나가기, [enter]: 이어하기, [C]: 상세정보", -1, -1));
    list.add(new AgeTest("당신의 정신연령은 <사회인수준> 입니다. [quit]: 나가기, [enter]: 이어하기, [D]: 상세정보", -1, -1));
    list.add(new AgeTest("당신의 정신연령은 <노인수준> 입니다. [quit]: 나가기, [enter]: 이어하기, [E]: 상세정보", -1, -1));
  }
}


/*
A타입 유아수준
마치 어린아이처럼 천진난만하고 순진무구한 유형.
그러나 순진무구한 부분이 잔혹함으로 변하기도 한다.
자기세계에서 자기 중심적으로 살아가며 자신의 욕구를 충족시키는 일을 가장 중요하게
생각한다. 물론 모든 일이 자기를 위해 움직이며 자기 뜻대로 될 것이라고 믿으며 살아간다.

초등
선악의 구분을 할 수 있으므로 해서는 안되는 일과 해도 되는 일을 구분 할 수 있다.
물론 때와 장소를 가려서 자신을 제어하는 능력도 갖추고 있다. 그러나
불안감과 공포심으로 가득하기 때문에 주변 사람들에게 쉽게 의지하고 유혹에 쉽게 현혹된다.

춘기
'질풍노도의 시기'라고 일컬어 지는 사춘기 수준.
고민이 많은 시기이기도 하다. 활동적이고 지적호기심이 왕성한 반면에 모든것을 알고 있다며
어른 행세를 하려든다. 때때로 오만하고 건방지다는 인상을 주기도 한다.

정신적으로 자립한 상태로 책임을 가지고 자신의 일을 해내는 사회인 수준
그러나 사물을 판단하는데 너무나 현실적이고 융통성이 없다.
물론 선입견과 고정관념에 사로잡혀 진실을 제대로 파악하지 못할 수도 있다.
또한 물질과 돈을 최우선으로 생각하는 경향이 있다.

인생을 달관하고 정신적인 안정을 추구하며 온화하고 평온한 상태.
돈, 물직적인 것에 집착하지 않고 인생을 즐기고자 하는 사람이지만 
새로운 일에 도전하는 것을 귀찮아 하며 세상일에 무관심한 경향이 있다.
*/