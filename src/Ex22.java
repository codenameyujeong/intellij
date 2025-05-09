public class Ex22 {
    public static void main(String[] args) {
        //반복문(for문)
        //변수가 선언된 시점(탄생시점) 부터, 변수를 포함한 영역이 종료되기전(종료중괄호)까지 살아있다.

        System.out.println("for문 1");
        for (int n = 1; n <= 10; n++) {
            System.out.println(" Hello Java" + n);
        }
        System.out.println("for문을 빠져 나옴.");
        System.out.println("\n========================\n");

        System.out.println("for문 2");
        int total = 0;

        for (int n = 1; n <= 10; n++) {
            total += n;
        }
        System.out.println("합계는 " + total);
        System.out.println("\n========================\n");


        System.out.println("for문 3");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        //System.out.println("\n i의 값: "+i);
//for(초; 조; 증){}
//while(조){}
//do{}while(조);


        System.out.println("for문 2-1");
        for (int n = 1; n <= 10; n++) {
            if (n == 7) break;
            total += n;
        }
        System.out.println("합계는 " + total);
        System.out.println("\n========================\n");


        System.out.println("for문 3-1");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + "  ");
        }
        System.out.println("\n========================\n");


    }
}
