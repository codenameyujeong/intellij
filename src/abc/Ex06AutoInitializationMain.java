package abc;

public class Ex06AutoInitializationMain {
    public static void main(String[] args) {
        Ex06AutoInitialization ins = new Ex06AutoInitialization();
        ins.md();

    }
}
class Ex06AutoInitialization{
    int a;
    boolean b;
    char c;
    double d;
    float f;
    long l;
    String s;

    public void md() {
        int A = 0;
        boolean B = false;
        char C= ' ';
        double D = 0.0;
        float F = 0.0f;
        long L = 0L;
        String S = null;
        System.out.println("▼ 멤버변수, 전역변수의 자료형에 따른 초기값");
        System.out.println("a의 초기값: " + a );
        System.out.println("b의 초기값: " + b );
        System.out.println("c의 초기값: " + c );
        System.out.println("d의 초기값: " + d );
        System.out.println("f의 초기값: " + f );
        System.out.println("l의 초기값: " + l );
        System.out.println("s의 초기값: " + s );
        System.out.println("\n================================");
        System.out.println("▼ 지역변수, 로컬변수의 자료형에 따른 초기값");
        System.out.println("a의 초기값: " + A );
        System.out.println("b의 초기값: " + B );
        System.out.println("c의 초기값: " + C );
        System.out.println("d의 초기값: " + D );
        System.out.println("f의 초기값: " + F );
        System.out.println("L의 초기값: " + L );
        System.out.println("s의 초기값: " + S );
    }
}
