package generic_001_yes;
//Box<T> T는 자료형변수라는 뜻임
public class Box<T> {//&10 T = Integer
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
	//"hello"
//	private Integer t;
//	public Integer get() { return t; }
//	public void set(Integer t) { this.t = t; }
}
