package abc;

public class Test {

	public static void main(String[] args) {
		//객체생성문형식 : 자료형 객체명 = new 생성자호출문;
		//형식 : 기본생성자 호출문 => 자료형()
		TestM tm = new TestM(); 
		System.out.println("총점은 : "+ tm.getTotal());
		System.out.printf("평균은 : %.2f \n",  tm.getAVG());
		tm.result();
	}

}
