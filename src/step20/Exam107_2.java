package step20;

public class Exam107_2 {
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    synchronized public long withdraw(long money) {
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
 * 크리티컬 섹션과 동기화 II
 * Critical Section 에 뮤텍스를 적용하려면
 * synchronize 키워드를 붙여라!
 * 
 * 
 */
