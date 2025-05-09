public class Ex13 {
    public static void main(String[] args){
        /*System.out.println("문자열값%서식자코드명1,..%서식지정자코드명n");
        int a = 1, b=2;
        System.out.println(a + "+" + b +"=" + (a+b));
        System.out.printf("%d+%d=%d", a, b, a+b);*/
        // printf() : 포맷터 사용
        int a = 30;



        System.out.printf("%d\n", a);
        System.out.printf("(30)10진수 =>(%o)8진수 표기\n", a);
        System.out.printf("(30)10진수 =>(%x)16진수 소문자표기\n", a);
        System.out.printf("(30)10진수 =>(%X)16진수 대문자표기\n", a);

        System.out.printf("%%s서식지정자(formatter)  %s\n", "문자열 출력");
        System.out.printf("%%f서식지정자(formatter) %f\n", 3.2582);
        System.out.printf("%10.2f\n", 3.2582);
        System.out.printf("%-10d과 %.4f\n", 10, 3.2582);

        System.out.printf("%%3d결과 : %3d", 123456);
        System.out.printf("바나나우유 230ML는 %,d원 입니다.\n", 1200);
        System.out.printf("10 < 20의 결과는 %b 입니다.%n", false);
        System.out.printf("%d %% %d의 결과는 %d 입니다.\n", 10, 3, (10%3));

// .formatted 메소드 (자바 17버전 이상)
        System.out.println("%s은 %,010d원 입니다.".formatted("가격", 5500));
        System.out.println("%s은 %-,10d원 입니다.".formatted("가격", 5500));

//텍스트블록(자바 17버전 이상)
        System.out.println(
                """
                안녕하세요.
                반갑습니다.
                하하하
                """
        );

//System.out.printf();

    }
}
