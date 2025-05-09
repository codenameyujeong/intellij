package abc;

public class Ex01InstanceMain {
    public static void main(String[] args) {
        Ex01Instance ins = new Ex01Instance();
        ins.x = 10;
        ins.y = 20;
        System.out.println( ins.x + ", " + ins.y );
    }
}
/*
* 생성자의 종류 - Default Constructor(기본 생상저):
* 생성자가 단한개도 기술된 것이없는 숨어있는 생성자
* 형식:public 클래스명(){}
* 만약 기본생성자에 직접실행코드를 기술해야되는 경우는
* 직접선언문을 기술해도된다
*
-Parameterized Constructor(매개변수가 존재하는 생성자-기타생성자):
* 필요하면 반드시 기술해야되는 생성자
 *형식:접근제어자 클래스명(매개변수들..){실행코드들}
*
* */
class Ex01Instance {
    int   x;
    int   y;
//    public Ex01Instance(int a, int b){};
}
