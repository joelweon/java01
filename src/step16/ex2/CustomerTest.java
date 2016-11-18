package step16.ex2;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("홍길동");
    //customer.setAge(300); // 값이 유효하지 않아 실행 오류 발생!
    customer.setAge(30);

    customer.setGender(false);

    System.out.printf("이름: %s, 나이: %d, 성별(여:true,남:false): %b\n", 
      customer.getName(), customer.getAge(), customer.getGender());
  }

}