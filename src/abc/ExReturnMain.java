package abc;

public class ExReturnMain {

    public static void main(String[] args) {
        ExReturn rt = new ExReturn();
        rt.say_nick("fool");
        System.out.println("출력결과 ");

    }

}
class ExReturn{
    public void say_nick(String nick) {
        if ("fool".equals(nick)) {
            return; //return키워드의 또 다른 쓰임새, 메소드의 종료 중괄호로 빠져나감.
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

}

