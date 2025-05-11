package Ex01first;

public class Ex03 {
    public static void main(String[] args){
        //전위/후위 연산자
        int a = 3;
        ++a;
        System.out.println("1: "+a);
        a--;
        System.out.println("2: " +a);

        int x2 = 5;
        int y2 =x2++;
        System.out.println("4: "+x2 + " " + y2);
        int x = 5;
        int y = 6;
        System.out.println(y++ +x);
        System.out.println(y);
    }
}
