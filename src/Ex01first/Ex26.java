package Ex01first;

public class Ex26 {
    public static void main(String[] args) {
        System.out.println("라벨 분기문 for문");
        gugudan:
        for (int i = 2; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                if (i == 4) break gugudan;
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
        System.out.println("\n=================\n");

        Gugudan:
        for (int i = 2; i <= 9; i++) {
            System.out.println("구구단 " + i + "단");
            for (int j = 1; j <= 9; j++) {
                if (i % 2 == 0) continue Gugudan;
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
        System.out.println("\n=================\n");
    }
}
