package generic_000_none;
public class Box {//&10
	private Object object;//홍길동이라는 Object("홍길동")
	public Object get() {
		return object;
	}
	//Object object = "홍길동";
	//Object object = &20;(Apple)
	public void set(Object object) {
		this.object = object;
	}//"홍길동"(String)
}
