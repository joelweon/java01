package step20;

public class Exam107_1 {
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    public long withdraw(long money) {
      long temp = this.balance;
      
      temp -= money;
      
      if (temp < 0) {
        return 0;
      }
      this.balance = temp;
      return money;
    } // withdraw
  }
    
  static class ATM extends Thread {
    Account  account;
    public ATM(String name) {
      super(name);
    }
    public void setAccount(Account account) {
      this.account = account;
    }    
    
    @Override
    public void run() {
      long sum = 0;
    
      while (true) {
        long money = 100;
        
        long result= account.withdraw(money);
        
        if (result == 0) {
          break;
        }
        sum += result;
      }
      System.out.printf("%s: %d\n", this.getName(), sum);
    }
  }
  
  public static void main(String[] args) throws Exception {
    Account account = new Account(1000000);
    
    ATM t1 = new ATM("강남");
    t1.setAccount(account);
    ATM t2 = new ATM("서초");
    t2.setAccount(account);
    ATM t3 = new ATM("부산");
    t3.setAccount(account);
    ATM t4 = new ATM("광주");
    t4.setAccount(account);
    ATM t5 = new ATM("제주");
    t5.setAccount(account);
    ATM t6 = new ATM("사북");
    t6.setAccount(account);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
  
  }
}

/*
 * 크리티컬 섹션과 동기화 (Critical section) - 여러 스레드가 동시에 실행할 떄 문제가 발생할 수 있는 코드를
 * "크리티컬 섹션"이라 부른다. 여러 스레드가 동시에 같은 메모리의 값을 변경하려 할 때 문제가 발생한다.
 * 
 * 세마포어(Semaphore)
 * - 크리티컬 섹션에 동시에 진입할 수 있는 스레드의 개수를 제한하는 기법을 말한다.
 * - Semaphore(4) => 동시에 4개까지 진입할 수 있다.
 *   예) 화장실
 * 뮤텍스(Mutex: MUTual EXclusion)
 * - 크리티컬 섹션에 오직 한 개의 스레드만이 진입할 수 있는 것을 말한다.
 * - Mutex == Semaphore(1)
 *   예) 화장실의 좌변기 
 * - 자바의 동기화는 뮤텍스 방식으로 동작한다.
 * 
 * 
 * 
 */
