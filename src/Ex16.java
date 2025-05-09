public class Ex16 {
    public static void main(String[] args){
        //강제 타입 변환 (=명시적 형변환) : 다운캐스팅, cast연산자 사용 : (자료형)
        short s = 20;
        byte b;
// b = s; //에러
        b = (byte) s;
        System.out.println("b의 값: "+b + ", s의 값: "+s);

        s = 200;
        b = (byte) s; //오버플로우(overflow) 발생
        System.out.println("b의 값: "+b + ", s의 값: "+s);

        s = -200;
        b = (byte) s; //언더플로우(underflow) 발생
        System.out.println("b의 값: "+b + ", s의 값: "+s);


        float f = 50.254f;
        int i = (int) f; //값 손실 발생
        System.out.println("i의 값: "+ i +", f의 값: "+ f);
    }
}
