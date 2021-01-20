package test;

public class App {


  public static void main(String []args) {
    //회원정보를 저장할 변수 선언
    String name;
    int age;
    boolean working;

    name = "이보나";
    age = 25;
    working = false;

    System.out.printf("이름: %s\n", name);
    System.out.printf("나이: %d\n",age);
    System.out.printf("재직상태: %b\n", working);
  }

}
