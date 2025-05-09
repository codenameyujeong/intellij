package abc;
class Ex10MyDate {
    private int y, m, d;
    private String str;

    private void setMyDate(int r) {
        if (r == 1)
            str = "유효한 날짜입니다.";
        else
            str = "유효하지 않은 날짜입니다.";
    }

    public String getMyDate() {
        return str;
    }

    public Ex10MyDate(int d1, int m1, int y1) {
        y = y1;
        m = m1;
        d = d1;
    }

    public void isValid() {
        int r;

        switch (m) {
            case 4: case 6: case 9: case 11:
                if (d <= 30) r = 1;
                else r = 0;
            case 2:
                if (y % 4 == 0) {
                    if (d <= 29) r = 1;
                    else r = 0;
                } else {
                    if (d <= 28) r = 1;
                    else r = 0;
                }
                break;
            default:
                if (d <= 31) r = 1;
                else r = 0;
                break;
        }

        setMyDate(r);

    }
}


public class Ex10MyDateTest {
    public static void main(String[] args) {

        Ex10MyDate ins = new Ex10MyDate(31, 5, 2021);
        ins.isValid();
        System.out.println(ins.getMyDate());
    }
}
