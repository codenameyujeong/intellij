package abc;

public class Ex05ConstructorMain {
    public static void main(String[] args) {
        int total;

        Ex05Constructor f1 = new Ex05Constructor(30, 30, 30);
        // Ex05Constructor f2 = new Ex05Constructor();
        total = f1.count();
        System.out.println("객체 f1의 총 개수 = " + total);
        System.out.println("객체 f1의 apple 개수 = " + f1.apple);

        System.out.println("객체 f1의 straw 개수 = " + f1.straw);
        System.out.println("객체 f1의 grapes 개수 = " + f1.grapes);

    }
}
class Ex05Constructor {
    int apple;
    int straw;
    int grapes;
    int sum;

    public Ex05Constructor(int ap, int st, int gr) {
        apple = ap;
        straw = st;
        grapes = gr;
    }

    public int count() {
        sum = apple + straw + grapes;
        return sum;
    }
}
