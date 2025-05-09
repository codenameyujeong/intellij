package abc;
class Ex03Constructor {
    int x;
    int y;
    public Ex03Constructor() {
        System.out.println("매개 변수가 없는 디폴트 생성자" );
    }

    public Ex03Constructor(int new_x, int new_y) {
        System.out.println("매개 변수가 있는 디폴트 생성자" );
        x = new_x;
        y = new_y;
    }

    public void showPoint(){
        System.out.println( x + ", " + y );
    }
}
public class Ex03ConstructorMain {
    public static void main(String[] args) {
        Ex03Constructor ins1 = new Ex03Constructor(100, 200);
        System.out.println( ins1.x + ", " + ins1.y );

        Ex03Constructor ins2 = new Ex03Constructor(300, 400);
        System.out.println( ins2.x + ", " + ins2.y );
    }
}
