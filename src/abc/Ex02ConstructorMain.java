package abc;
class Ex02Constructor {
    int x;
    public Ex02Constructor() {
        x = 5;
    }
}

public class Ex02ConstructorMain {
    public static void main(String[] args) {
        Ex02Constructor myObj = new Ex02Constructor();
        System.out.println(myObj.x);
    }
}
