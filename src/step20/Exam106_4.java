package step20;

public class Exam106_4 {
  static class MyThread extends Thread {}
  
  public static void main(String[] args) throws Exception {
    Thread parentThread = Thread.currentThread();
    parentThread.setPriority(8);
    System.out.printf("%s(%d) %d\n",
        parentThread.getName(), parentThread.getId(), parentThread.getPriority());
    
    MyThread childThread = new MyThread();
    System.out.printf("%s(%d) %d\n",
        childThread.getName(), childThread.getId(), childThread.getPriority());
    
    childThread = new MyThread();
    childThread.setPriority(3);
    System.out.printf("%s(%d) %d\n",
        childThread.getName(), childThread.getId(), childThread.getPriority());
    
  }
}


/*부모 자식 스레드의 우선순위
 * 부모 스레드는 스레드를 생성한 스레드.
 * 자식 스레드는 부모 스레드의 우선 순위를 가져온다. 
 * 
 */
