package interfaceex;

public interface A {
	final int CONS = 5;// public static final 생략 가능  final즉 상수는 초기화 또는 값을 무조건넣어야함
	public void display(String s);  //추상클래스선언문 public abstract 생략 가능
	void imd();
	private void pmd() { 
		System.out.println("A인터페이스 안의 pmd");
	}
	//원래 public default임. 접근제어자의 default가 아닌 몸체를 가질 수 있는 메소드임.
	default void dfmd(String str) {
		System.out.println(
				"A인터페이스 안의 dfmd메소드의 str변수 값: " 
				+ str + "와 CONS의 값: " + CONS
		);
	}
	
	static int stmd(int c) {
		return CONS+c;
	}
	
}



