package interfaceex;

public class CalcEx {

	public static void main(String[] args) {
		String s1 = "하하하";//New를 단축형식으로 없이 쓰면 stack에 저장된다
		String s2 = new String("하하하");//heap에 "하하하"를 저장함
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//if(s1==s2){}는 객체를 비교하기떄문에false가나오고 if(s1.equals(s2)) equals은 값비교이기때문에 true가 나옴
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		
		Calc c = new CalcCha1();
		c.add(5, "덧셈");
		c.minus(5);
		c.multi(5);
		c.divi(3);
	}

}
