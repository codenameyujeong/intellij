//package inheritance;
//
//class Par {
//    int p = 0;
//}
//
//class Cld extends Par {
//    int c = 1;
//}
//
//class Bro extends Par {
//    int b = 2;
//}
//
//public class InhEx04 {
//    public static void main(String[] args) {
//        Par pa01 = new Par();
//        Cld ch = new Cld();
//        Par pa02 = new Bro();
//        Bro br = new Bro();
//
//        pa01 = (Par) ch;
//        pa01 = ch;
//        pa01.p = 2;
//        pa01.c = 2;
//        ch.p = 5;
//        br.p = 5;
//        pa02.b = 6;
//        // 타입 변환을 생략할 수 없음.
//        // 다운캐스팅: 다시 자식 자료형으로 돌아오는 것
//        br = (Bro) pa02;
//        br.p = 5;
//        br.b = 7;
//
//        pa02.b = 7;
//        System.out.println("pa02.b: " + pa02.b);
//
//        System.out.println(
//                "br.p : " + br.p + " / br.b : " + br.b
//        );
//        // 직접적인 상속 관계가 아니므로, 오류 발생.
//        br = (Bro) ch;
//
//    }
//
//}
//
