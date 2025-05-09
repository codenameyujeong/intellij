public class Ex04 {
    public static void main(String[] args){
        int a = 10, b = 10;
        int c = a;
        System.out.println(" a: " + a + " ,c " + c );
        c = ++a +b;
        System.out.println(" a: " + a + " ,c " + c );
        c = a++ +b;
        System.out.println(" a: " + a + " ,c " + c );
    }
}

/* 예시1:
int a, b;
a = 5;
b = 10;
예시2:
int a=5 , b=10 ;
예시3:
int a, b = 10;
a=5;
 */