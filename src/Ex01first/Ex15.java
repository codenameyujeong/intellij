package Ex01first;

public class Ex15 {
    public static void main(String[] args) {
        // 자동 타입 변환 = 묵시적 타입 변환 (업캐스팅)
// byte < short <  int < long < float < double
        byte b = 20;
        short s = b;
        System.out.println("변수 b의 값: "+b);
        System.out.println("변수 s의 값: "+s);
        System.out.println("==================\n");

        int i = b;
        System.out.println("변수 i_b의 값: "+i);
        i = s;
        System.out.println("변수 i_s의 값: "+i);
        System.out.println("==================\n");

        long l = b;
        System.out.println("변수 l_b의 값: "+l);
        l = s;
        System.out.println("변수 l_s의 값: "+l);
        l = i;
        System.out.println("변수 l_i의 값: "+l);
        System.out.println("==================\n");

        float f = b;
        System.out.println("변수 f_b의 값: "+f);
        f = s;
        System.out.println("변수 f_s의 값: "+f);
        f = i;
        System.out.println("변수 f_i의 값: "+f);
        f = l;
        System.out.println("변수 f_l의 값: "+f);
        System.out.println("==================\n");

        double d = b;
        System.out.println("변수 d_b의 값: "+d);
        d = s;
        System.out.println("변수 d_s의 값: "+d);
        d = i;
        System.out.println("변수 d_i의 값: "+d);
        d = l;
        System.out.println("변수 d_l의 값: "+d);
        d = f;
        System.out.println("변수 d_f의 값: "+d);
        System.out.println("==================\n");

        long ll = 999999999999999999L;
        System.out.println(ll);
//값 손실 발생
        f = ll;
        System.out.println(f);

//값 손실 발생
        d = ll;
        System.out.println(d);

        char c = 'A';
//b = c;
//s = c;
        i = c;
        System.out.println("변수 i_c의 값: "+i);
        l = c;
        System.out.println("변수 l_c의 값: "+l);
        f = c;
        System.out.println("변수 f_c의 값: "+f);
        d = c;
        System.out.println("변수 d_c의 값: "+d);
        System.out.println("==================\n");


        i = 5;
//String s = i;
        //String s = "행복을 의미하는 숫자는 "+i; //업캐스팅 (기본자료형 -> 참조자료형)
        System.out.println(s);
//String에서 기본자료형타입으로는 다운캐스팅이 되지 않는다.
    }
}
