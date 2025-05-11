package Ex01first;

public class Ex12 {
    public static void main(String[] args) {
        /* println()괄호안에 문자열값이 아무것도 없어도된다 그럴경우 한줄 바꿈만 실행 또는괄호안에 문자열값이있으면 해당문자열 출력후 한줄바꿈실행,
         print()괄호안에 반드시 "(빈문자열)값이라도 있어야한다 또 풀력할 문자열이 반드시존재해야됨",
          printf()한줄바꿈이 존재하지않음 또 괄호안에 문자열을 출력시 서식지정자를 사용하여 출력가능 printf()는 %서식지정자를씀,
           println()괄호안에 문자열을 출력시출력순서를임의로 지정하여 출력하며 에러메세지처럼 출력되며 빨간색으로 출력됨 라는 출력문들이 있음.*/
        // print()
        System.out.print("반갑");
        System.out.print("습니다");
        System.out.print("7");
        System.out.print("\n");
        System.out.print("\n");
//println()
        System.out.println("안녕하세요");
        System.out.println("안녕" + "하세요");
        System.out.println();

        System.out.println(2 + 4);
        System.out.println("문자" + 1);
        System.out.println("문자" + 1 + 2);
        System.out.println(1 + 2 + "문자");
        System.out.println();

        int a = 5;
        String b = "하세요";
        System.out.println(a);
        System.out.println(b);
        System.out.println("안녕" + b);
        System.out.println(a + "안녕" + b);
        System.out.println();
    }
}
