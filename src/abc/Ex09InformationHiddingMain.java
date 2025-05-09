package abc;

public class Ex09InformationHiddingMain {
    public static void main(String[] args) {
        int total;
        Ex09InformationHidding f1 = new Ex09InformationHidding(30, 30, 30);
        total = f1.gettotal(); // f1.count()를 사용하면 에러 발생
        System.out.println("객체 f1의 총 개수 = " + total);
        System.out.println("객체 f1의 apple 개수 = " + f1.getapple());
        System.out.println("객체 f1의 straw 개수 = " + f1.getstraw());
        System.out.println("객체 f1의 grapes 개수 = " + f1.getgrapes());
    }
}

class Ex09InformationHidding {
    private int a;
    private int s;
    private int g;
    private int sum;

    Ex09InformationHidding(int apple, int straw, int grapes) {
        a = apple;
        s = straw;
        g = grapes;
        count();
    }

    private void count() { // count() 라는 메소드를 숨긴다
        sum = a + s + g;
    }

    public int gettotal() {
        // 모든 과일의 합은 이 메소드를 통해서만 접근
        return sum;
    }

    public int getapple() {
        // a 값에 대해 읽기만 허용하기 위한 메소드
        return a;
    }

    public int getstraw() {
        return s;
    }

    public int getgrapes() {
        return g;
    }
}
