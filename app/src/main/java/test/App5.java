package test;

public class App5 {

  //회원정보를 저장할 새로운 메모리 구조를 설계한다.
  //=>사용자(개발자) 정의 데이터 타입

  //메모리 설계도
  static class Member{
    String name;
    int age;
    boolean working;
  }


  public static void main(String []args) {

    //새 설계도에 따라 메모리(변수들을)를 준비한다.
    //설계도에 따라 준비한 변수 및 레퍼런스
    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();
    //m1 => 설계도에 따라 준비한 메모리의 주소를 보관한다.
    //new Member() => Member설계도에 따라 변수를 생성한 후 그 주소를 리턴한다.


    //Member 설계도에 따라 준비한 메모리 사용하기
    //인스턴스에 소속된 변수에 값넣기
    m1.name = "이보나"; //m1.<= m1 주소가 가르키는 name에 "이보나"넣기
    m1.age = 25;
    m1.working = false;

    m2.name = "전유민";
    m2.age = 25;
    m2.working = true;

    m3.name = "강민경";
    m3.age = 25;
    m3.working = true;

    printMember(m1);
    printMember(m2);
    printMember(m2);

  }

  static void printMember(Member m) {
    System.out.println("---------------------------------");
    System.out.printf("이름: %s\n", m.name);
    System.out.printf("나이: %d\n",m.age);
    System.out.printf("재직상태: %b\n", m.working);
    System.out.println("---------------------------------");
  }

}
