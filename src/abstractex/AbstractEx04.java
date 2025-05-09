package abstractex;

interface PAbs{
	void i();//public absreact void i();
	void j();//public absreact void j();
	void k();//public absreact void k(); 상속되는곳에 재정의해주기
}


abstract class Abs {//접근가능
	void a() {
		System.out.println("일반-a메소드");
	}

	public abstract void b();
	public abstract void c();
	public void d() {};
}

class Cbs extends Abs implements PAbs {

	@Override
	public void i() {
		System.out.println("i메소드 재정의");
	}//접근가능x

	@Override
	public void j() {
		System.out.println("j메소드 재정의");	
	}//접근가능x

	@Override
	public void k() {
		System.out.println("k메소드 재정의");
	}//접근가능x

	@Override
	public void b() {
		System.out.println("b메소드 재정의");
	}//접근가능

	@Override
	public void c() {
		System.out.println("c메소드 재정의");//접근가능
	}
}

public class AbstractEx04 {
	public static void main(String[] args) {
		Abs ca = new Cbs();//파차케이스
		Cbs ca1 = new Cbs();//차차
		ca1.a();
		ca1.b();
	}
}
