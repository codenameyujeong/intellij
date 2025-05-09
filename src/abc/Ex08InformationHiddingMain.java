package abc;

class Ex08InformationHidding {
    private int x;
    private int y;
    private int count;
    private int age;

    public void setCount(int cnt) {
        count = cnt;
    }

    public int getCount() {
        return count;
    }

    public void setX(int new_x) {
        x = new_x;
    }

    public void setY(int new_y) {
        y = new_y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    //기본생성자가 숨어있음.public Ex08InformationHidding(){}
}

public class Ex08InformationHiddingMain {
    public static void main(String[] args) {
        Ex08InformationHidding ins = new
                Ex08InformationHidding();
        ins.setX(10);
        ins.setY(20);
        System.out.println(ins.getX() + ", " + ins.getY());
    }
}
