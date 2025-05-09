package interfaceex;

public interface Color {
	public static final int RED = 1; //public static final이생략되있음
	int GREEN = 2;
	int BLUE = 3;

	void setColor(int c); //메서든데 몸체 즉 {}가없음 그럴떈 public abstract가 생략되있음
	int getColor(); 
}