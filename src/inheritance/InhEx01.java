package inheritance;

class AA {
    int i;
    int j;

    public void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class BB extends AA {
    int total;

    public void sum() {
        total = i + j;
    }
}

public class InhEx01 {
    public static void main(String args[]) {
        BB subOb = new BB();//chacha케이스

        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("합계 : " + subOb.total);
    }
}
