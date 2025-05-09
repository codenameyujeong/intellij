public class Ex14 {
    public static void main(String[] args){
        double a = 5.20;
        double b = 2.52;
        System.out.println(a+b); // 부동소수점 방식으로 오차 발생됨.
        System.out.printf("%.2f + %.2f = %f", a, b, a+b);
    }
}
