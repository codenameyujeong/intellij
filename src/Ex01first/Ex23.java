package Ex01first;

public class Ex23 {
    public static void main(String[] args) {
        System.out.println("while문 1");
        int total = 0;
        int i = 1;

        while (i <= 10) {
            total += i;
            i++;
        }
        System.out.println(total);
        System.out.println("\n========================\n");

        System.out.println("do while문 1");
//do ~ while 문형식:for문과 다르게 조건이 맞지 않아도 do안의
//실행문은 맨처음한번은실행함
        total = 0;
        i = 1;

        do {
            total += i;
            i++;
        } while (i <= 10);
        System.out.println(total);
        System.out.println();


        i=5;
        do{
            System.out.print(i+" ");
            i--;
        }while(i>=1);
        System.out.println("\ndo~while문 종료 후 : "+i+"\n");
        System.out.println("\n========================\n");

        System.out.println("중첩 for문");
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n========================\n");
    }
}
