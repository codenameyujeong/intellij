package abc;

public class This {
    private int width, height;

    public This() {
        this(0, 0); // 다른 생성자 호출
    }

    public This(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
