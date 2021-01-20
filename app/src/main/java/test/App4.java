package test;

public class App4 {

  //회원정보를 저장할 새로운 메모리 구조를 설계한다.
  //=>사용자(개발자) 정의 데이터 타입

  //메모리 설계도
  static class Member{
    String name;
    int age;
    boolean working;
  }


  public static void main(String []args) {
    //-----------------------------------------------------

    Member m;
    m = new Member();
    m.name = "심위안";
    m.age = 4;
    m.working = false;


    //-----------------------------------------------------

    Member [] arr = new Member[3];
    arr[0]=new Member();

    arr[0].name = "이보나";
    arr[0].age = 25;
    arr[0].working = false;

    printMember(arr[0]);


  }

  static void printMember(Member m) {
    System.out.println("---------------------------------");
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n",m.age);
    System.out.printf("재직상태: %b\n", m.working);
    System.out.println("---------------------------------");
  }

}
